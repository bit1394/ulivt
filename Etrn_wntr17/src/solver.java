import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n, k;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		k = in.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < nums.length; i++){
			nums[i] = in.nextInt();
		}
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] % k == 0){
				System.out.print(nums[i] + " ");
			}
		}
	}
}

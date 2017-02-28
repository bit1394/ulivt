import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n, k;
		int num;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		k = in.nextInt();
		num = 0;
		
		int[] nums = new int[n];
		
		for(int i = 0; i < nums.length; i++){
			nums[i] = in.nextInt();
		}
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] % k == 0){
				num++;
			}
			
		}
		System.out.print(num);
	}
}



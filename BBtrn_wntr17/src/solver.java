import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n;
		int min, max;
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		int[] nums = new int[n];
		
		for (int i = 0; i < nums.length; i++){
			nums[i] = in.nextInt();
		}
		
		min = nums[0];
		max = nums[0];
		for(int i = 1; i < nums.length; i++){
			if (nums[i] > max){
				max = nums[i];
			}
			if(nums[i] < min){
				min = nums[i];
			}
		}
		
		System.out.println(min + " " + max);
		

	}

}

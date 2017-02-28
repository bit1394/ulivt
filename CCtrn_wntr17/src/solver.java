import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n;
		int min_index, max_index, min, max;
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		int[] nums = new int[n];
		
		for (int i = 0; i < nums.length; i++){
			nums[i] = in.nextInt();
		}
		
		min_index = 0;
		max_index = 0;
		min = nums[0];
		max = nums[0];
		for(int i = 0; i < nums.length; i++){
			if (nums[i] >= max){
				max = nums[i];
				max_index = i;
				
			}
			if(nums[i] < min){
				min = nums[i];
				min_index = i;
			}
		}
		
		System.out.println((min_index + 1) + " " + (max_index + 1));
		
	}

}

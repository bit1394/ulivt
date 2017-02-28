import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n;
		int number;
		int tmpMax, max;
		Scanner inp = new Scanner(System.in);
		
		n = inp.nextInt();
		tmpMax = 0;
		max = 0;
		
		int[] a = new int[100002];
		
		for(int i = 0; i < 100001; i++){
			a[i] = 0; 
		}
		
		for(int i = 1; i <= n; i++){
			number = inp.nextInt();
			if(a[number] == 0){
				a[number] = i;
			} else{
				tmpMax = i - a[number];
				if(tmpMax > max) max = tmpMax;
				a[number] = i;
			}
		}
		
		System.out.println(max);

	}

}

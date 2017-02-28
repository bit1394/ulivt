import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n;
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		int[] b = new int[n];
		for(int i = 0; i < b.length; i++){
			b[i] = in.nextInt();
		}
		
		for(int i = 0; i < b.length - 1; i++){
			for(int j = 0; j < b.length - i - 1; j++){
				if(b[j] > b[j + 1]){
					int tmp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = tmp;
				}
			}
		}
		
		System.out.println(b[n - 2]);
		
		

	}

}

import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int  n, m, l, r;
		int answ;

		Scanner inp = new Scanner(System.in);
		
		n = inp.nextInt();
		m = inp.nextInt();
		answ = 0;

		int[] lr = new int[n];
		
		for(int i = 0; i < n; i++){
			lr[i] = 0;
		}
		
		for(int i = 0; i < m; i++){
			l = inp.nextInt();
			r = inp.nextInt();
			
			for(int j = l; j <= r; j++){
				lr[j] = 1;
			}
		}
		
		for(int a = 0; a < n; a++){
			if(lr[a] == 1) answ++;
		}
		
		System.out.println(answ);

	}

}

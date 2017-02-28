import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, m;
		int k;
		
		n = in.nextInt();
		m = in.nextInt();
		
		int[] r = new int[n];
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++){
			r[i] = in.nextInt();
		}
		
		for (int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		
		int solved;
		solved = 0;
		for (int i = 0; i < n; i++){
			if(r[i] == 1) a[i] = 0;
			solved += r[i];
		}
	
		k = m - solved;
		
		System.out.println(k);
		
		int tmp_num = 0;
		
		for(int j = 0; j < k; j++){
			int tmp = 0;
	
			for (int i = 0; i < n; i++){
				if (a[i] > tmp){
					tmp_num = i;
					tmp = a[i];
					}
				}
			System.out.print((tmp_num + 1) + " ");
			a[tmp_num] = 0;
		}		
	}

}

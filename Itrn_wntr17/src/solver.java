import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n, m, b;
		long money, need_money;
		money = 0;
		need_money = 0;
		
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		m = inp.nextInt();
		
		int[] g = new int[m]; 
		for(int i = 0; i< m; i++){
			g[i] = inp.nextInt();
		}
		
		int[] a = new int[n];
		for(int i = 0; i< n; i++){
			a[i] = inp.nextInt();
		}
		
		b = inp.nextInt();
		
		for(int j = m; j < n; j++){
			need_money += a[j];
		}
		
		if (need_money > b){
			money = b;
		} else {
			if(need_money < b){
				money = need_money;
			} else {
				money = b;
			}
		}
		System.out.println(money);	
	}

}

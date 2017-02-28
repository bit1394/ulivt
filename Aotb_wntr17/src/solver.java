import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n, m, a, b, c;
		int min, answ;
		
		Scanner inp = new Scanner(System.in);
		
		n = inp.nextInt();
		m = inp.nextInt();
		a = inp.nextInt();
		b = inp.nextInt();
		c = inp.nextInt();
		
		min = (a < (b * n)) ? a : (b * n);
		answ = (min < (c * m)) ? min : (c * m);
		
		System.out.println(answ);
	}

}

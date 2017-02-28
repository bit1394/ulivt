import java.util.Scanner;

public class solver {

	final static String Y = "YES";
	final static String N = "NO";
	
	public static void main(String[] args) {
		int ticket;
		int a, b, c, d;
		
		Scanner in = new Scanner(System.in);
		
		ticket = in.nextInt();
		
		a = ticket / 1000;
		b = ticket % 1000 / 100;
		c = ticket % 1000 % 100 / 10;
		d = ticket % 1000 % 100 % 10;
		
		if((a + b) == (c + d)) {
			System.out.println(Y);
		} else {
			System.out.println(N);
		}
		
	}

}

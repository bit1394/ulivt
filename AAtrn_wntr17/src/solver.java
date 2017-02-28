import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int a, b;
		int max, min;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		
		max = a + b;
		
		min = a > b ? b - a : a - b;
		
		System.out.println(max + " " + min);

	}

}

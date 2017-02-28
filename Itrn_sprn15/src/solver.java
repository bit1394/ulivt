import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		
		int a, b, c;
		double d;
		
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		d = b * b - 4 * a * c;
		if (d < 0) {
			System.out.println(0);
			return;
		} 
		if (d == 0){
			double x;
			x = -b / ( 2 * a);
			System.out.println(1);
			System.out.println(x);
			return;
		}
		if(d > 0) {
			double x, y;
			x = (-b + Math.sqrt(d)) / (2 * a);
			y = (-b - Math.sqrt(d)) / (2 * a);
			if(x > y){
				double tmp;
				tmp = x;
				x = y;
				y = tmp;
			}
			 
			System.out.println(2);
			System.out.println(x + " " + y);
			return;
		}

	}

}

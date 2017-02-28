import java.util.Scanner;

public class solver {

	public static void main(String[] args) {

		int n, M, V, E;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		V = n * 2 / 3;
		M = n / 3 / 2;
		E = M;
		
		System.out.println(M + " " + V + " " + E);
	}

}

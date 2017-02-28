import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		int out;
		
		n = in.nextInt();
		out = 0;
		
		while (n > 1){
			if(n % 3 == 0) {
				n = n / 3;
				out++;
			}
			else
				if(n % 2 == 0) {
					n = n / 2;
					out++;
				}
				else {
					n--;
					out++;
				}
		}
		
		System.out.println(out);
	}

}

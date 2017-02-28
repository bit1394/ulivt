import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int w, h;
		int x, y;
		int a, b;
		int min;
		
		String answ = null;
		Scanner inp = new Scanner(System.in);
		
		w = inp.nextInt();
		h = inp.nextInt();
		
		x = inp.nextInt();
		y = inp.nextInt();

		a = w - x;
		b = h - y;
		
		min = (x < a) ? x : a;
		min = (min < y) ? min : y;
		min = (min < b) ? min : b;
		
		if(min == a) answ = "E";
		if(min == b) answ = "N";
		if(min == x) answ = "W";
		if(min == y) answ = "S";
		
		System.out.println(answ);
	}

}

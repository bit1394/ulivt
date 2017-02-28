import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		String s;
		
		int pos, max;
		max = 0;
		pos = 0;
		
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		
		while (s.indexOf(' ') != -1){
			pos = s.indexOf(' ');
			if (pos > max) max = pos;
			s = s.substring(pos + 1, s.length());	
			//System.out.println(pos);
		}
		if (s.length() > max) max = s.length();
		
	System.out.println(max);
	}
}
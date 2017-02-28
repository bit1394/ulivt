import java.util.Scanner;

public class solver {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		
		int pos;
		String sub, answ;
		boolean is_eq;
		
		pos = 0;
		is_eq = false;
		
		while (pos < b.length()){
			sub = b.substring(pos, pos + 1);
			//System.out.println(sub);
			if(a.indexOf(sub) >= 0) {
				is_eq = true;
				a = a.substring(a.indexOf(sub));
				pos++;
				} else {
					is_eq = false;
					break;
					}
			}
		answ = (is_eq) ? "YES" : "NO";
		System.out.println(answ);
	}
}

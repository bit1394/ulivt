import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		String sA, sB;
		char[] c_sA;
		String out;
		Scanner in = new Scanner(System.in);
		
		sA = in.nextLine();
	
		c_sA = sA.toCharArray();	
		sort(c_sA);
	
		System.out.println(sA);
	}

	static void sort(char[] s){
		
		for(int i = 0; i < s.length; i++){
			for(int j = 0; j < s.length - 2; i++){
				if(s[j] >= s[j + 1]){
					char tmp;
					tmp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = tmp;
						
				}
			}
		}
		s.toString();
		System.out.println(s);
		
	}
	

}

import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n;
		
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		
		System.out.println(prime(n));

	}
	
	static String prime(int a){
		String ret;
		int buf;
		buf = 0;
		ret = "NO";
		    for(int j = 2; j <= Math.round(Math.sqrt(a)); j++){
		      if(a % j == 0 && a != j) {
		        buf = 1;
		        break;
		        } 
		      }
		  if(buf != 1) ret = "YES";
		  if(a == 1) ret = "NO";
		    return ret;
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class solver {

	public static void main(String[] args) throws IOException {
		
				int n, result;
				int c;

				result = 0;
				
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				StringTokenizer str;
			    str = new StringTokenizer(in.readLine());
			    n = Integer.parseInt(str.nextToken()); 
			    
			    for(int i = 0; i < n; i++){
			    	c = in.read();
				    if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')))
						result++;
				}
			    System.out.println(result);

			}

}

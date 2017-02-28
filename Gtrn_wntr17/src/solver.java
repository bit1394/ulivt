import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n, num;
		
		num = 0;
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		
		while(!lucky(n)){
			num++;
			n++;
		}

		System.out.println(num);
	}
	
	static boolean lucky(int a){
		boolean ret;
		int x, y;
		int[] dig = new int[6];
		
		ret = false;
		
		for(int i = 0; i < 6; i++){
			dig[i] = a % 10;
			a = a / 10;
		}
		
		x = dig[0] + dig[1] + dig[2];
		y = dig[3] + dig[4] + dig[5];
		if(x == y) ret = true;
		return ret;
		
	}

}

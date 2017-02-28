import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int numOfDays, day;
		int tmp, maxWarmLine;
		Scanner in = new Scanner(System.in);
		
		numOfDays = in.nextInt();
		int[] temper = new int[numOfDays];
		tmp = 1;
		maxWarmLine = 0;
		day = 0;
		
		for(int i = 0; i < temper.length; i++){
			temper[i] = in.nextInt();
		}
		
		for(int i = 1; i < temper.length; i++){
			while(temper[i - 1] < temper[i]){
				tmp++;
				if(i < temper.length - 1){
					i++;
				} else break;
			}
			if(tmp > maxWarmLine){
				maxWarmLine = tmp;
			}
			tmp = 1;
		}
		
		System.out.println(maxWarmLine);
	}

}

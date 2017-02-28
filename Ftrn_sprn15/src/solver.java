import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		int day, stud;
		double kpd, task;
		task = 2;
		day = 2;
		stud = 2;
		kpd = task / (day * stud); // kpd of 1 student
		
		day = n;
		stud = n;
		task = kpd * day * stud;
		
		System.out.println(task);
	}

}

import java.util.Scanner;

public class solver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		
		int hh, mm;
		hh = h / 60;
		mm = h % 60;
		
		String h_, m_;
		if(hh < 10) {
			h_ = "0" + hh + ":";
		} else {
			h_ = "" + hh + ":";			
		}
		if(mm < 10) {
			m_ = "0" + mm;
		} else{
			m_ = "" + mm;
		}
		
		System.out.println(h_ + m_);

	}

}

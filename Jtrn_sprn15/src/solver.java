import java.util.Scanner;

public class solver {
	/*
J. Вычёркивание
Дано слово A и слово B. Определите, можно ли получить слово B, вычеркнув в слове A некоторое (возможно, пустое) подмножество букв.

Входные данные
Первая строка содержит слово A, состоящее из строчных латинских букв. Длина слова A не превышает 100 символов.

Первая строка содержит слово B, состоящее из строчных латинских букв. Длина слова B не превышает 100 символов.

Выходные данные
Выведите YES, если слово B можно получить вычёркиванием букв из слова A. В противном случае выведите NO.

Примеры
Входные данные				Выходные данные
informational
normal						YES
informational
fractional					NO
	 */
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
			sub = b.substring(pos, pos + 1); //System.out.println(sub);
			//System.out.println(sub);
			if(a.indexOf(sub) >= 0) { //System.out.println(a);
				is_eq = true;
				a = a.substring(a.indexOf(sub) + 1);
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
//ok
import java.util.Scanner;

public class solver {
	/*
	 H. Длинное слово
Дана строка, состоящая из строчных латинских букв и пробелов. Определите, сколько букв в самом длинном слове этой строки.

Входные данные
Ввод содержит строку S, длина которой не превышает 100 символов. Гарантируется, что в строке S есть хотя бы одна буква.

Выходные данные
Выведите одно целое число — количество букв в самом длинном слове строки.

Примеры
Входные данные								Выходные данные
this is an example							7
this string has not so many long words		6
programming is cool							11
	 */

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

//ok
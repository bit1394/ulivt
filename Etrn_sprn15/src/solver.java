import java.util.Scanner;

public class solver {
	/*
	 E. Бубруйский трамвайный билет
	 Бубруйск — маленький город, там всего одна трамвайная линия, а номера всех трамвайных билетов содержат четыре цифры. Жители Бубруйска считают, что трамвайный билет счастливый, если первые две его цифры в сумме дают то же число, что и последние две цифры.

Вам дан номер бубруйского трамвайного билета. Определите, счастливый ли этот билет.

Входные данные
Первая строка содержит четырёхзначное целое число N (0000 <= N <= 9999) — номер трамвайного билета.

Выходные данные
Если билет счастливый, выведите YES, иначе выведите NO.

Примеры
Входные данные	Выходные данные
2305			YES
6214			NO
0716			YES
	 */

	final static String Y = "YES";
	final static String N = "NO";
	
	public static void main(String[] args) {
		int ticket;
		int a, b, c, d;
		
		Scanner in = new Scanner(System.in);
		
		ticket = in.nextInt();
		
		a = ticket / 1000;
		b = ticket % 1000 / 100;
		c = ticket % 1000 % 100 / 10;
		d = ticket % 1000 % 100 % 10;
		
		if((a + b) == (c + d)) {
			System.out.println(Y);
		} else {
			System.out.println(N);
		}
		
	}

}
//ok
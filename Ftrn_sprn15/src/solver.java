import java.util.Scanner;

public class solver {
	/*
	 F. Лабораторные
	 Два студента за два дня решат две лабораторные работы, если будут помогать друг другу. Сколько лабораторных работ решат N студентов за N дней, если будут помогать друг другу?

Входные данные
Первая строка содержит целое число N (1 <= N <= 100).

Выходные данные
Выведите одно вещественное число — количество лабораторных работ, которые решат N студентов за N дней. Ответ должен быть абсолютно точным.

Примеры
Входные данные	Выходные данные
2				2
4				8
9				40.5
	 */

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
//ok
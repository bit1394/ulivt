import java.io.*;
import java.util.*;

/*
 А. Наименьшее и наибольшее
 Даны четыре числа. Требуется найти самое маленькое и самое большое из них.

Входные данные
Первая строка содержит целые числа A, B, C, D (-100 <= A, B, C, D <= 100).

Выходные данные
Выведите в одной строке два целых числа — минимальное и максимальное из введённых чисел.

Примеры
Входные данные	Выходные данные
1 2 3 4			1 4
45 11 27 -54	-54 45
33 33 33 33		33 33
*/


public class solver {

	public static void main(String[] args) {
		int n;
		int max, min;
		int i;
		Scanner in = new Scanner(System.in);
		
		max = -101;
		min = 101;
		
		for (int k = 0; k < 4; k++){
			n = in.nextInt();
			if(n > max) max = n;
			if(n < min) min = n;
		}
		
		System.out.println(min + " " + max);

	}

}

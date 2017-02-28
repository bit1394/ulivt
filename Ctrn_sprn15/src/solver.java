import java.util.Scanner;

public class solver {
	 /*
	  * C. От 1 до N
	  * 
	  * Определите, чему будет равна сумма всех целых чисел от единицы до заданного числа N.

Входные данные
Первая строка содержит целое число N (1 <= N <= 100).

Выходные данные
Выведите одно целое число — сумму чисел от 1 до N.

Примеры
Входные данные	Выходные данные
5				15
20				210
77				3003

	  */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int out = 0;
		
		for(int i = 1; i <= n; i++){
			out = out + i;
		}
		
		System.out.println(out);
	}

}

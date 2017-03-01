import java.util.Locale;
import java.util.Scanner;

public class solver {
	/*
I. Уравнение
Дано квадратное уравнение вида Ax2 + Bx + C = 0. Требуется вычислить все его действительные корни.

Входные данные
Входной поток содержит три целых числа A, B и C (-100 <= A, B, C <= 100; A, B, C ≠ 0) — коэффициенты квадратного уравнения.

Выходные данные
В первой строке выведите одно целое число N — количество действительных корней уравнения.

Во второй строке выведите, разделяя пробелами, N вещественных чисел — корни уравнения в порядке возрастания. 
Точность ответа должна составлять не менее 4 знаков после запятой.

Примеры
Входные данные	Выходные данные
1 5 6			2
				-3.0000	-2.0000
1 -2 1			1
				1.0000
2 1 3			0
	 */

	public static void main(String[] args) {
		
		int a, b, c;
		int d;
		
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		d = b * b - 4 * a * c;
		
		if (d < 0) {
			System.out.println(0);
		} else {
			if (d == 0){
				float x;
				x = (-1)*b / (2 * a);
				System.out.println(1);
				//System.out.println(x);
				System.out.printf(Locale.US, "%.5f", x);
			} else {
				if(d > 0) {
					float x, y;
					x = (float)((-1)*b + Math.sqrt(d)) / (2 * a);
					y = (float)((-1)*b - Math.sqrt(d)) / (2 * a);
					if(x > y){
						float tmp;
						tmp = x;
						x = y;
						y = tmp;
					}	 
					System.out.println(2);
					//System.out.println(x + " " + y);
					System.out.printf(Locale.US, "%.5f %.5f", x, y);
				}
			}
		}

	}

}
//wrong answer test5 
import java.util.*;
/*
 * B.Лесенка
 Нарисуйте звёздочками лесенку указанного размера, как показано в примерах.

Входные данные
Первая строка содержит целое число N (1 <= N <= 100).

Выходные данные
Выведите N строк: первая строка содержит одну звёздочку, вторая – две звёздочки, ..., последняя — N звёздочек.

Примеры
Входные данные	Выходные данные
3				*
 				**
 				***
4				*
 				**
 				***
 				****
5				*
 				**
 				***
 				****
 				*****
 
 */

public class solver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
//ok

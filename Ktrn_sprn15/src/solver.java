import java.util.Scanner;

public class solver {
	/*
K. Четвертьфинал

Участникам четвертьфинала чемпионата мира по программированию предлагаются для решения N задач. Команда Максима уже решила некоторые задачи; кроме того, Максим подсчитал, что для выхода в полуфинал нужно решить не менее M задач.

Разумеется, из оставшихся задач команде Максима выгодно решать самые лёгкие. Путём анализа турнирной таблицы Максим выяснил, сколько команд успело решить каждую из задач. Как правило, чем проще задача, тем больше команд её решили.

Помогите Максиму и его команде узнать, какие задачи выгодно решать.

Входные данные
Первая строка содержит целые числа N и M (1 <= N <= 1000, 1 <= M <= N) — соотвественно общее количество задач и количество задач, которое необходимо решить для выхода в полуфинал.

Вторая строка содержит N целых чисел Ri, i-е из которых равно 1, если команда Максима решила i-ю задачу, либо 0 в противном случае.

Третья строка содержит N целых чисел Ai (1 <= Ai <= 10^5), i-е из которых равно количеству команд, решивших i-ю задачу. Гарантируется, что все числа Ai различны.

Выходные данные
В первой строке выведите целое число K — минимальное количество задач, которое нужно дополнительно решить команде Максима, чтобы пройти в полуфинал.

Во второй строке выведите K целых чисел — номера задач, которые нужно решить, в порядке от наиболее простой до наиболее сложной.

Примеры
Входные данные			Выходные данные
5 3 					1
1 0 1 0 0 				4
25 30 12 54 23			
						
3 2						2
0 0 0					2 1
7 12 3	
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, m;
		int k;
		int solved;
		
		solved = 0;
		n = in.nextInt();
		m = in.nextInt();
		
		int[] r = new int[n];
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++){// solved OR no
			r[i] = in.nextInt();
			if(r[i] == 1) {
				solved++; // number of solved tasks
			}
		}
		
		for (int i = 0; i < n; i++){ //number of commands, which solved tasks
			a[i] = in.nextInt();
			if(r[i] == 1){
				a[i] = 0;//this task not interest
			}
		}
		
		k = m > solved ? m - solved : 0;
		
		System.out.println(k);
		
		int tmp_num = 0;
		
		for(int j = 0; j < k; j++){
			int tmp = 0;
	
			for (int i = 0; i < n; i++){
				if (a[i] > tmp){
					tmp_num = i + 1;
					tmp = a[i];
					}
				}
			System.out.print((tmp_num) + " ");
			a[tmp_num - 1] = 0;
			tmp_num = 0;
		}		
	}

}
//ok
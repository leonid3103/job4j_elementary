package loop;
/**
 * Класс для вычисления арифметических операций +,-,*,/,=
 * @author Leonid Bakhmutov
 * @since 04.07
 * @version 1
 */
public class Counter {

    public static int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = i + sum;
            }
            }
               return sum;
            }
            }



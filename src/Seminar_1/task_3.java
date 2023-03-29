package Seminar_1;
//Вывести все простые числа от 1 до 1000 простое число - то число
//которое делится без остатка только на 1 и на само себя (1 - это не простое число);
public class task_3 {
    public static void primeNumbers(int n) {
        for (int j = 2; j <= n; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(j + " ");
            }
        }
    }
}

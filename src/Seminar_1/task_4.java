package Seminar_1;

import java.util.Scanner;

//Реализовать простой калькулятор
public class task_4 {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Укажите арифметическое действие: '+', '-', '/', '*'");
        char arithmetic = scanner.next().charAt(0);
        System.out.println("Введите втророе число: ");
        double secondNumber = scanner.nextDouble();
        double result = 0;

        if(arithmetic == '+') result = firstNumber + secondNumber;
        if(arithmetic == '-') result = firstNumber - secondNumber;
        if(arithmetic == '/') result = firstNumber / secondNumber;
        if(arithmetic == '*') result = firstNumber * secondNumber;

        System.out.println("Результат: " + result);
    }
}

package Seminar_1;

import java.util.Scanner;

import static Seminar_1.task_1.findTriangularNumber;
import static Seminar_1.task_2.factorial;
import static Seminar_1.task_3.primeNumbers;
import static Seminar_1.task_4.calculator;

public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //task_1, task_2, task_3
        System.out.println("Введите число: "); //task_1, task_2, task_3
        Integer number = Integer.valueOf(scanner.next()); //task_1, task_2, task_3
        System.out.println("Треугольное число: " + findTriangularNumber(number)); //task_1
//        System.out.println("Факториал введённого числа:" + factorial(number)); //task_2
//        primeNumbers(number); //task_3
//        calculator(); //task_4
    }
}

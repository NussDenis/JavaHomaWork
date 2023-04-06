package Seminar_3;

import java.util.*;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task_3 {
    public static void maxMinAverageNumbers() {
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        double sum = 0;
        double count = 0;
        for (int i = 0; i < 5; i++) {
            list.add(rd.nextInt(1, 10));
        }
        System.out.println("Вывод массива:" + list);
        System.out.println("Max:" + Collections.max(list));
        System.out.println("Min:" + Collections.min(list));
        for (Integer i: list){
            sum+=i;
            count++;
        }
        System.out.println("Average:" + sum/count);
    }
}

package Seminar_3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Collections.list;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task_2 {
    public static void removingEvenNumbers() {
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(rd.nextInt(1, 10));
        }
        System.out.println("Вывод массива:" + list);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i)%2 == 0) {
                list.remove(i);
            i--;
            }
        }
        System.out.println("Массив без четных чисел:" + list);
    }
}

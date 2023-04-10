package Seminar_4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task_1 {
    public static void Revers() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        while (!list.isEmpty()) System.out.println(list.removeLast());
    }
}

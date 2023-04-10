package Seminar_4;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.*;
public class Task_2 {
    public static void listEnqueue(){
        Scanner sc = new Scanner(System.in);
        var list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Введите элемент: ");
        int x = sc.nextInt();
        list.addLast(x);
        System.out.println(list);
    }
    public static void listDequeue(){
        var list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
    public static void first(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.getFirst());
    }
}

package Seminar_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Example1 td = new Example1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                " 1. ОЗУ\n" +
                " 2. Тип ОС\n" +
                " 3. Емкость памяти\n");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Введите минимальное значение ОЗУ: ");
                Integer minRAM = sc.nextInt();
                System.out.println("Введите максимальное значение ОЗУ: ");
                Integer maxRAM = sc.nextInt();
                td.isMatchRAM(minRAM,maxRAM);
                break;
            case 2:
                System.out.println("Введите марку операционной системы: ");
                String os = sc.next();
                td.searchByOS(os);
                break;

        }
    }

}

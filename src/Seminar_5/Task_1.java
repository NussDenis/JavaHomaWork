package Seminar_5;
// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Scanner;

public class Task_1 {

  private static void recData(HashMap<String, String> data, String skey, String svalue) {
    data.put(skey, svalue);
  }

  private static String changeData(HashMap<String, String> data, String skey) {
    String value = "";
    value = data.get(skey);
    return value;
  }

  private static void printData(HashMap<String, String> data) {
    int count = 1;
    for (var str : data.entrySet()) {
      System.out.printf("\t%d. %s: %s\n", count++, str.getKey(), str.getValue());
    }
    System.out.println();
  }

  public static void phoneBook() {

    System.out.print("\033[H\033[2J"); // очистка консоли
    Scanner iScanner = new Scanner(System.in);

    int count = 0;

    HashMap<String, String> data = new HashMap<>();

    boolean fl = true;
    System.out.println("--- Структура телефонной книги с помощью HashMap ---\n");
    do {
      count = data.size();
      if (count >= 1) {
        System.out.printf("\tВ телефонной книге записей -> %d\n\n", count);
      } else {
        System.out.print("\tВ телефонной книге записей нет.\n\n");
      }
      System.out.println("\tДобавить  - - - - - - - - - нажмите '1'");
      System.out.println("\tПоиск - - - - - - - - - - - нажмите '2'");
      System.out.println("\tПечать архива - - - - - - - нажмите '3'");
      System.out.println("\tВыход из программы  - - - - нажмите '0'");

      System.out.print("\nВведите число -> ");
      int n = iScanner.nextInt();
      String skey = "";
      String svalue = "";
      switch (n) {
        case 1:
          boolean fl1 = true;

          System.out.print("- Добавление адресата -\n");
          System.out.print("Введите ФИО адресата -> ");
          skey = iScanner.next();
          skey = skey.substring(0, 1).toUpperCase() + skey.substring(1);

          System.out.print("\n");
          do {
            System.out.print("Введите номер телефона -> ");

            String temp = "";
            temp = iScanner.next();
            svalue += temp + " ";

            System.out.println("Желаете ввести еще номер?");
            System.out.print("Нажмите 'Y' - Да, 'N' - Нет -> ");
            String st = iScanner.next();
            if ("y".equals(st.toLowerCase())) {
              fl1 = true;
            } else {
              fl1 = false;
            }
            recData(data, skey, svalue);
          } while (fl1);
          break;
        case 2:
          Boolean fl2 = true;
          do {
            System.out.println("\tПоиск:");
            System.out.print("Введите ФИО адресата -> ");
            skey = iScanner.next();
            skey = skey.substring(0, 1).toUpperCase() + skey.substring(1);
            if (changeData(data, skey) == null) {
              System.out.print("В адресной книги с таким именем '" + skey + "' нет записей\n");
            } else {
              System.out.printf("\tРезультат поиска %s: -> %s\n\n", skey, changeData(data, skey));
            }
            System.out.println("Желаете продолжить поиск?");
            System.out.print("Нажмите 'Y' - Да, 'N' - Нет -> ");
            String st = iScanner.next();
            if ("y".equals(st.toLowerCase())) {
              fl2 = true;
            } else {
              fl2 = false;
            }
          } while (fl2);
          break;
        case 3:
          System.out.println("\tПечать телефонной книги:");
          printData(data);
          break;
        case 0:
          System.out.print("Завершение программы.\n\n");
          fl = false;
          break;
      }

    } while (fl);
    iScanner.close();
  }
}
package Seminar_5;
// Пусть дан список сотрудников:
// Написать программу, которая найдёт и выведет повторяющиеся имена с
// количеством повторений. Отсортировать по убыванию популярности.
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task_2 {
  public static void repetition() {

    var a = new HashSet<>(Arrays.asList());
    ArrayList<String> data = new ArrayList<>();
    // ArrayList<String> ind = new ArrayList<>();

    try {
      String pathProject = System.getProperty("user.dir");
      String pathFile = pathProject.concat("/contact_task_2.txt");
      File file = new File(pathFile);
      BufferedReader bufReader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8));
      int size = 18;
      for (int i = 0; i < size; i++) {
        data.add(bufReader.readLine());
      }
      bufReader.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Информация с файла:\n");
      System.out.println(data);
      System.out.println();
    }

    System.out.println("Повторяющиеся имена с количеством повторений:");
    
    ArrayList<String> namesData = new ArrayList<>(); // переменная для сохранения имен
    for (int i = 0; i < data.size(); i++) {
      var str = data.get(i).split(" ");
      namesData.add(str[0]);
    }

    a.addAll(namesData); // добавление уникальных имен

    var ind = new ArrayList<String>(); // переменная для сохранения и работы с уникальными именами
    for (Object iter : a) {
      ind.add(iter.toString());
    }

    int[] countN = new int[ind.size()]; // переменная для подсчета имен
    for (int i = 0; i < ind.size(); i++) {
      for (int j = 0; j < namesData.size(); j++) {
        if (ind.get(i).equals(namesData.get(j))) {
          countN[i] += 1;
        }
      }
    }

    for (int i = 0; i < countN.length; i++) {
      System.out.printf("\nВ списке имя '%s'\tвстречается -> %s раза", ind.get(i), countN[i]);
    }

    System.out.println();

    System.out.println("\nСортировка по убыванию популярности:");

    int temp1 = 0;
    String temp2 = "";

    for (int i = 0; i < countN.length - 1; i++) {
      for (int j = i; j < countN.length; j++) {
        if (countN[i] < countN[j]) {
          temp1 = countN[i];
          temp2 = ind.get(i);
          countN[i] = countN[j];
          ind.set(i, ind.get(j));
          countN[j] = temp1;
          ind.set(j, temp2);
        }
      }
    }

    int coun = 1;
    for (int i = 0; i < countN.length; i++) {
      System.out.printf("\n%d место  - '%s'\tвстречается -> %s раза", coun++, ind.get(i), countN[i]);
    }
    System.out.println("\n");


  }
}

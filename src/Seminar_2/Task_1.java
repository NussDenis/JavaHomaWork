package Seminar_2;
//1.Реализуйте алгоритм сортировки пузырьком числового массива,
//результат после каждой итерации запишите в лог-файл.
//(через FileWriter).

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task_1 {
    static void bubbleSort() {
        int[] array = new int[]{7, 3, 5, 13, 4, 12, 1};
        try (FileWriter in = new FileWriter("log.txt")){
        boolean flag = true;
            while (flag) {
                flag = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        flag = true;
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                    in.append(Arrays.toString(array)).append("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
            }
    }
}
package Seminar_3;

import java.util.Arrays;

import static Seminar_3.Task_1.mergeSort;

public class Main_1 {
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10, 77, 41, 8};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));

        Task_2.removingEvenNumbers();
    }
}
package Seminar_1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n),

public class task_1 {
    public static int findTriangularNumber(int n) {
        int sum = 0;
        while (n > 0){
            sum+= n;
            n--;
        }
        return sum;
    }
}
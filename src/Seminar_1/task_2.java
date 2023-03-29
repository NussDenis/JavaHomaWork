package Seminar_1;
//n! (произведение чисел от 1 до n)
public class task_2 {
    public static int factorial(int n) {
        int sum = 1;
        while (n > 0){
            sum*= n;
            n--;
        }
        return sum;
    }
}

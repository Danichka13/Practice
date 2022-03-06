package partFour.taskThree;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для проверка:");
        int num = scan.nextInt();
        System.out.println("Введите число на которое хотите разделить:");
        int div = scan.nextInt();

        TakeIntReturnBool temp = (x) -> x % div == 0;
        System.out.println(temp.calculation(num));
    }
}

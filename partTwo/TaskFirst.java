package partTwo;

import java.util.Scanner;

public class TaskFirst {

    public static void main(String[] args) {

        System.out.println("Введите сколько хотите увидеть чисел из ряда Фибоначчи: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        rowFibbonacci(num);
    }

    static void rowFibbonacci(int num) {

        int first = 0;
        int second = 1;
        int result = 0;
        System.out.println("Ряд Фибоначчи из [" + num + "] символов:\n" + first + "\n" + second);
        num -= 2; //вычитаю 2, т.к. первые два числа уже написаны заранее
        // (изначально сделал проверку в цикле, но убрал, т.к. она используется один раз,
        // и проще вывести первые два числа)
        while (num > 0) {
            result = first + second;
            first = second;
            second = result;
            System.out.println(result);
            num--;
        }
    }
}

package partFour;

import java.util.Scanner;

public class TaskSix {

    private static long var = 2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько простых чисел хотите увидеть?");
        int N = scan.nextInt();
        System.out.println();
        int count = 0;
        while (count != N) {
            if (getNext(var) == 0) {
            } else {
                System.out.println(getNext(var));
                count++;
            }
            var++;
        }
    }

    public static long getNext(long temp) {
        boolean flag = true;
        for (int i = 2; i < temp; i++) {
            if (temp % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return temp;
        } else {
            return 0;
        }
    }
}

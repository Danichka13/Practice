import java.util.Scanner;

public class TaskFourth {

    public static void main(String[] args) {

        arrayLine();
    }

    public static void arrayLine() {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[30];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Массив чисел: ");
        for (int i = 1; i <= arr.length; ++i) {
            System.out.print(arr[i - 1] + "\t");
            if (i % 10 == 0 && i > 1)
                System.out.println();
        }
    }
}

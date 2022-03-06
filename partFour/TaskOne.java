package partFour;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите размерность массива: ");
        int N = scan.nextInt();

        int[][] arr = new int[N][N];
        int rMin = 0, rMax = N - 1, cMin = 0, cMax = N - 1;
        int count = 1;
        boolean k = false;

        while (rMax >= 0 || cMax >= 0) {
            if (k) {
                cMin++;
                rMax--;
            }
            //Движение по верхней строке вправо
            for (int i = rMin; i <= rMax; i++) {
                arr[cMin][i] = count++;
            }
            cMin++;

            if (k) {
                cMax--;
            }
            //Движение по правому столбцу вниз
            for (int i = cMin; i <= cMax; i++) {
                arr[i][rMax] = count++;
            }
            rMax--;

            if (k) {
                rMin++;
            }
            //Движение по нижней строке влево
            for (int i = rMax; i >= rMin; i--) {
                arr[cMax][i] = count++;
            }
            cMax--;
            //Движение по левому столбцу вверх
            for (int i = cMax; i > cMin; i--) {
                arr[i][rMin] = count++;
            }
            rMin++;
            k = true;
        }
        System.out.println("Спиральный массив " + N + " x " + N + " :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

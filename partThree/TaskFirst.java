package partThree;

import java.util.*;

public class TaskFirst {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int rows = scan.nextInt();
        System.out.println("Введите количество столбцов:");
        int cols = scan.nextInt();

        int[][] array = reset(rows, cols);
        System.out.println("Исходный массив:");
        print(array);

        int flag = 0;
        while (flag != 5) {
            array = reset(rows, cols);
            System.out.println("Введите номер образца:\n1) Диагональный\n2) Вертикально-горизонтальный\n" +
                    "3) Квадратный\n4) Ромбовидный\n5) Выход");
            flag = scan.nextInt();
            switch (flag) {
                case (1): {
                    System.out.println("\nДиагональный");
                    diagonal(array);
                    print(array);
                    break;
                }
                case (2): {
                    System.out.println("\nВертикально-горизонтальный:");
                    verticalAndHorizontal(array);
                    print(array);
                    break;
                }
                case (3): {
                    System.out.println("\nКвадратный:");
                    square(array);
                    print(array);
                    break;
                }
                case (4): {
                    System.out.println("\nРомбовидный:");
                    rhombus(array);
                    print(array);
                    break;
                }
                case (5): {
                    break;
                }
                default: {
                    System.out.println("Неверно введён номер");
                }
            }
        }
    }

    static int[][] reset(int rows, int cols){
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }

    static void diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                }
            }
        }
    }

    static void verticalAndHorizontal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length / 2) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = 1;
                }
            } else {
                for (int j = 0; j < arr.length; j++) {
                    if (j == arr.length / 2) {
                        arr[i][j] = 1;
                    }
                }
            }
        }
    }

    static void square(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = 1;
                }
            } else {
                for (int j = 0; j < arr.length; j++) {
                    if (j == 0 || j == arr.length - 1) {
                        arr[i][j] = 1;
                    }
                }
            }
        }
    }

    static void rhombus(int[][] arr) {
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) {
                for (int j = 0; j < arr.length; j++) {
                    if (j == arr.length / 2) {
                        arr[i][j] = 1;
                    }
                }
            } else if (i == arr.length / 2) {
                for (int j = 0; j < arr.length; j++) {
                    if (j == 0 || j == arr.length - 1) {
                        arr[i][j] = 1;
                    }
                }
            } else if (i > arr.length / 2) {
                for (int j = 0; j < arr.length; j++) {
                    if (j == k || j == arr.length - 1 - k) {
                        arr[i][j] = 1;
                    }
                }
                k++;
            } else {
                for (int j = 0; j < arr.length; j++) {
                    if (j == arr.length / 2 + i || j == arr.length / 2 - i) {
                        arr[i][j] = 1;
                    }
                }
            }

        }
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

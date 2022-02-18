package partTwo;

import java.util.Scanner;

public class TaskFourth {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = scan.nextLine();

        stringMinMax(str);
    }


    static void stringMinMax(String str) {

        String min = str.substring(0, str.indexOf(" "));
        String newStrMin = str.substring(0, str.indexOf(" "));
        String max = str.substring(0, str.indexOf(" "));
        String newStrMax = str.substring(0, str.indexOf(" "));
        str = str.substring(str.indexOf(' ') + 1);
        String var;
        boolean flag = true;

        while (flag) {
            if (str.indexOf(" ") != -1) { //проверка на последнее слово
                var = str.substring(0, str.indexOf(" "));
                if (var.length() < min.length()) { //проверка на минимальный элемент
                    newStrMin = var;
                    min = var;
                } else if (var.length() == min.length()) { //если размеры совпали
                    newStrMin += " " + var;
                    min = var;
                }
                if (var.length() > max.length()) { //проверка на максимальный элемент
                    newStrMax = var;
                    max = var;
                } else if (var.length() == max.length()) { //если размеры совпали
                    newStrMax += " " + var;
                    max = var;
                }
                str = str.substring(str.indexOf(' ') + 1);
            } else{
                if (str.length() < min.length()) {
                    newStrMin = str;
                } else if (str.length() == min.length()) {
                    newStrMin += " " + str;
                }
                if (str.length() > max.length()) {
                    newStrMax = str;
                } else if (str.length() == max.length()) {
                    newStrMax += " " + str;
                }
                flag = false;
            }
        }
        System.out.printf("Слова максимальной длины: %s\nСлова минимальной длины: %s", newStrMax, newStrMin);
    }
}

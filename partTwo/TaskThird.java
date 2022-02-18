package partTwo;

import java.util.Scanner;

public class TaskThird {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = scan.nextLine();
        System.out.println("Введите номер позиции:");
        int number = sc.nextInt();
        System.out.println("Введите символ для замены: ");
        String symb = scan.nextLine();
        char symbol = symb.charAt(0);

        replaceSymbol(str, number, symbol);
    }


    static void replaceSymbol(String str, int num, char symb) {

        String var;
        String newStr = "";
        boolean flag = true;

        while (flag) {
            if (str.indexOf(' ') != -1) { //проверка на последнее слово
                var = str.substring(0, str.indexOf(' '));
                if (var.length() < num) { //проверка, хватает ли размера строки, чтобы заменить в ней нужный индекс
                    newStr += var;
                } else {
                    newStr += var.substring(0, num-1) + symb + var.substring(num);
                }
                newStr += " ";
            } else {
                if (str.length() < num) {
                    newStr += str;
                } else {
                    newStr += str.substring(0, num-1) + symb + str.substring(num);
                }
                flag = false;
            }
            str = str.substring(str.indexOf(' ') + 1);
        }
        System.out.printf("Полученная строка, в которой мы заменили все [ %d ] позиции на символ - [ %s ] :\n%s", num, symb, newStr);
    }
}

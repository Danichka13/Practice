package partTwo;

import java.util.Scanner;

public class TaskSecond {

    public static void main(String[] args) {

        System.out.println("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        deleteSimbols(str);
    }

    static void deleteSimbols(String str) {

        char[] ch = str.toCharArray();
        String newStr = "";
        //первая проверка на буквы английского или русского алфавита
        //вторая проверка на 'space' и на 'Ё' и 'ё'
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'А' && ch[i] <= 'я')) {
                newStr += ch[i];
            } else if (ch[i] == ' ' || ch[i] == 'Ё' || ch[i] == 'ё') {
                newStr += ch[i];
            }
        }
        System.out.println("Строка, содержащая только буквы (и пробелы):\n" + newStr);
    }
}

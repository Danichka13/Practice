import java.util.*;

public class Practice {

    public static void main(String[] args) {

        //0printHello();
        //operationMath();
        //operationBool();
        //arrayLine();
        //simbNum();
        //coincidentalLetters();
        //printBottles();
        //calcicator();
        //printPalindrom();
        //Expressions exp = new Expressions();
        //exp.start();
        //low();

    }

    public static void printHello() {
        System.out.println("Hello World!");
    }

    public static void operationMath() {

        int x = 15;
        float y = 22.77f;
        System.out.printf("Математические операции с числом [%d] типа int и числом [%f] типа float:\n" +
                "Сложение: %f\nВычитание: %f\nДеление: %f\nУмножение: %f", x, y, x + y, x - y, x / y, x * y);
    }

    public static void operationBool() {
        boolean x = false;
        boolean y = true;

        System.out.printf("Операции с булевыми переменными [%b] [%b]:\nNOT: %b %b\nAND: %b\nOR: %b" +
                        "\nStrict OR: %b\nConditional AND: %b\nConditional OR: %b\nEquals: %b\n\n",
                x, y, !x, !y, x & y, x | y, x ^ y, x && y, x || y, x == y);
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

    public static void simbNum() {

        String str = "Hello World!";
        char[] ch = str.toCharArray();
        System.out.println("\nПосимвольный вывод строки [" + str + "] и числовой код каждого символа:");
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                System.out.println("Space = " + (int) ch[i]);
            } else {
                System.out.println(ch[i] + " = " + (int) ch[i]);
            }
        }
    }

    public static void coincidentalLetters() {

        String str = " Hello World! ";
        char[] ch = str.toCharArray();
        char[] arr = new char[ch.length];
        int[] num = new int[ch.length];

        int count;
        int size = 0;
        int sizeTwo = 0;
        int check = 0;

        System.out.println("\nПовторяющиеся буквы в строке [" + str + "]");

        for (int i = 0; i < ch.length; i++) {
            count = 0;
            i = 0;
            char n = ch[i];
            for (int j = 0; j < ch.length; j++) {
                if (Character.compare(n, ch[j]) == 0) {
                    count++;
                    if (count > 1 && ch != null) {
                        check = 0;
                        for (int k = 0; k < arr.length; k++) {
                            if (ch[j] == arr[k]) {
                                check++;
                            }
                        }
                        if (check < 1) {
                            arr[size] = ch[j];
                            size++;
                        }
                    }
                } else {
                    ch[j - count] = ch[j];
                }
            }
            if (count > 1) {
                num[sizeTwo] = count;
                sizeTwo++;
            }
            char[] newCh = new char[ch.length - count];
            for (int j = 0; j < newCh.length; j++) {
                newCh[j] = ch[j];
            }
            ch = new char[newCh.length];
            for (int j = 0; j < newCh.length; j++) {
                ch[j] = newCh[j];
            }
        }
        char[] newArr = new char[size];
        int[] newNum = new int[size];
        for (int j = 0; j < newArr.length; j++) {
            newArr[j] = arr[j];
            newNum[j] = num[j];
            if (newArr[j] == ' ') {
                System.out.println("Space - " + newNum[j]);
            } else {
                System.out.println(newArr[j] + " - " + newNum[j]);
            }
        }
    }

    public static void printBottles() {
        System.out.println("Вывод строки про бутылки:");
        for (int i = 100; i > 0; i--) {
            if (i == 1) {
                System.out.println(i + " бутылка стояла на столе. Упала и разбилась.");
            } else if (i % 10 > 4 || i % 10 == 0 || (i > 10 && i < 15)) {
                System.out.print(i + " бутылок стояло на столе, одна из них упала и разбилась. ");
            } else if (i % 10 == 1) {
                System.out.print(i + " бутылка стояла на столе, одна из них упала и разбилась. ");
            } else {
                System.out.print(i + " бутылки стояли на столе, одна из них упала и разбилась. ");
            }
        }
    }

    public static void printPalindrom() {
        String str = "A roza уПала нA лау Azora";
        char[] ch = str.toCharArray();
        char[] newCh = new char[ch.length];

        System.out.println("Является ли предложение [" + str + "] палиндромом?");

        int k = 0;
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'a' && ch[i] <= 'z') || ((ch[i] >= 'а' && ch[i] <= 'я'))) {
                newCh[k] += ch[i];
                k++;
            }
            if ((ch[i] >= 'A' && ch[i] <= 'Z') || ((ch[i] >= 'А' && ch[i] <= 'Я'))) {
                newCh[k] += (char) (ch[i] + 32);
                k++;
            }
        }
        char[] sravn = new char[k];
        for (int i = 0; i < sravn.length; i++) {
            sravn[i] = newCh[i];
        }
        System.out.println(Arrays.toString(sravn));
        int j = 0;
        char[] newSravn = new char[sravn.length];
        for (int i = sravn.length - 1; i > -1; i--) {
            newSravn[j] = sravn[i];
            j++;
        }
        System.out.println(Arrays.toString(newSravn));
        int flag = 0;
        for (int i = 0; i < sravn.length; i++) {
            if (sravn[i] == newSravn[i]) {
            } else {
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Это предложение - палиндром");
        } else {
            System.out.println("Это предложение - не палиндром");
        }
    }

    public static void calcicator() {
        String str = "-12+3/6-7/2+4-3*5-11";
        System.out.println(str);
        String numbFirst = "";
        String numbSecond = "";
        String x = "";

        int flag = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '*' || str.charAt(j) == '/') {
                flag++;
            }
        }
        while (flag > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '*') {
                    numbFirst = str.substring(0, i);
                    numbSecond = str.substring(i + 1);
                    x = concatination(cutBefore(numbFirst), multiply(cutNumBefore(numbFirst), cutNumAfter(numbSecond)), cutAfter(numbSecond));
                    i = str.length();
                } else if (str.charAt(i) == '/') {
                    numbFirst = str.substring(0, i);
                    numbSecond = str.substring(i + 1);
                    x = concatination(cutBefore(numbFirst), division(cutNumBefore(numbFirst), cutNumAfter(numbSecond)), cutAfter(numbSecond));
                    i = str.length();
                }
            }
            flag--;
            str = x;
        }
        flag = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '+' || str.charAt(j) == '-') {
                flag++;
            }
        }
        String var = "";
        int count = 0;
        while (flag > 0) {
            for (int i = 1; i < str.length(); i++) {
                count = 0;
                if (str.charAt(i) == '+') {
                    for (int j = i + 1; j < str.length(); j++) {
                        if (str.charAt(j) == '+' || str.charAt(j) == '-') {
                            int first = Integer.parseInt(str.substring(0, i));
                            int second = Integer.parseInt(str.substring(i + 1, j));
                            var = String.valueOf(first + second) + str.substring(j);
                            j = str.length();
                            count++;
                        } else if (j + 1 == str.length()) {
                            int first = Integer.parseInt(str.substring(0, i));
                            int second = Integer.parseInt(str.substring(j));
                            var = String.valueOf(first + second);
                            j = str.length();
                            count++;
                        }
                    }
                } else if (str.charAt(i) == '-') {                                                                       // -14 - 11
                    for (int j = i + 1; j < str.length(); j++) {
                        if (str.charAt(j) == '+' || str.charAt(j) == '-') {
                            int first = Integer.parseInt(str.substring(0, i));
                            int second = Integer.parseInt(str.substring(i + 1, j));
                            var = String.valueOf(first - second) + str.substring(j);
                            j = str.length();
                            count++;
                        } else if (j + 1 == str.length()) {
                            int first = Integer.parseInt(str.substring(0, i));
                            int second = Integer.parseInt(str.substring(i + 1));
                            var = String.valueOf(first - second);
                            j = str.length();
                            count++;
                        }
                    }
                }
                if (count > 0) {
                    i = str.length();
                }
            }
            str = var;
            flag--;
        }
        System.out.println("Ответ: " + str);
    }

    public static String concatination(String bef, String aft, String num) {
        return bef + aft + num;
    }

    public static String multiply(String first, String second) {
        return String.valueOf(Integer.parseInt(first) * Integer.parseInt(second));
    }

    public static String division(String first, String second) {
        return String.valueOf(Integer.parseInt(first) / Integer.parseInt(second));
    }

    public static String cutBefore(String str) {

        char[] ch = str.toCharArray();
        String num = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '*' || ch[i] == '/' || ch[i] == '+' || ch[i] == '-') {
                num = str.substring(0, i + 1);
            }
        }
        return num;
    }

    public static String cutAfter(String str) {

        char[] ch = str.toCharArray();
        String num = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '*' || ch[i] == '/' || ch[i] == '+' || ch[i] == '-') {
                num = str.substring(i);
                i = ch.length;
            }
        }
        return num;
    }

    public static String cutNumBefore(String str) {

        char[] ch = str.toCharArray();
        String num = "";
        int flag = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '*' || ch[i] == '/' || ch[i] == '+' || ch[i] == '-') {
                num = str.substring(i + 1);
                flag++;
            }
        }
        if (flag == 0) {
            num = str;
        }
        return num;
    }

    public static String cutNumAfter(String str) {

        char[] ch = str.toCharArray();
        String num = "";
        int flag = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '*' || ch[i] == '/' || ch[i] == '+' || ch[i] == '-') {
                num = str.substring(0, i);
                i = ch.length;
                flag++;
            }
        }
        if (flag == 0) {
            num = str;
        }
        return num;
    }

}
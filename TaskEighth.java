import java.util.Arrays;

public class TaskEighth {
    public static void main(String[] args) {

        String str = "-12+3/6-7/2+4-3*5-11";
        calcicator(str);
    }

    public static void calcicator(String str) {

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

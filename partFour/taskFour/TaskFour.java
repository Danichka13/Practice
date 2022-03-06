package partFour.taskFour;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanStr.nextLine();
        System.out.println("Введите количество копий:");
        int N = scanInt.nextInt();
        System.out.println("Введите длину:");
        int L = scanInt.nextInt();

        PutComma put = (s, n, l) -> {

            ArrayOfWords arrayOfWords = (x) -> {
                String newStr = "";
                ArrayList<String> tempArrWord = new ArrayList();
                char[] ch = x.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] == ' ') {
                        for (int j = 0; j < n; j++) {
                            tempArrWord.add(newStr);
                        }
                        newStr = "";
                    } else if (i == ch.length - 1) {
                        newStr += ch[i];
                        for (int j = 0; j < n; j++) {
                            tempArrWord.add(newStr);
                        }
                        newStr = "";
                    } else {
                        newStr += ch[i];
                    }
                }
                return tempArrWord;
            };

            ArrayList<String> arrWord = arrayOfWords.createArray(s);

            NewString newString = (x) -> {
                String tempStr = "";
                for (int i = 0; i < x.size(); i++) {
                    tempStr += x.get(i);
                    tempStr += ",";
                }
                return tempStr;
            };

            String cutTemp = newString.createStr(arrWord);
            cutTemp = cutTemp.substring(0, cutTemp.lastIndexOf(","));

            CutingStr cut = (x) -> {
                while (x.length() > l) {
                    if (x.lastIndexOf(",") == -1) {
                        x = "";
                    } else {
                        x = x.substring(0, x.lastIndexOf(","));
                    }
                }
                return x;
            };

            return cut.cutStr(cutTemp);
        };

        System.out.println(put.comma(str, N, L));
    }
}

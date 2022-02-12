public class TaskSixth {

    public static void main(String[] args) {

        coincidentalLetters();
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
}

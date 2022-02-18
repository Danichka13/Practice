public class TaskNinth {

    public static void main(String[] args) {

        printPalindrom();
    }

    public static void printPalindrom() {
        String str = "A roza уПала нА лАпу Azora";
        char[] ch = str.toCharArray();
        char[] newCh = new char[ch.length];

        System.out.println("Является ли предложение [" + str + "] палиндромом?");

        int k = 0;
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'а' && ch[i] <= 'я')) {
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
        int j = 0;
        char[] newSravn = new char[sravn.length];
        for (int i = sravn.length - 1; i > -1; i--) {
            newSravn[j] = sravn[i];
            j++;
        }
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
}

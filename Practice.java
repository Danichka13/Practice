import java.util.*;

public class Practice {

    public static void main(String[] args) {

        //printHello();
        //operationMath(15, 22.71f);
        //operationBool(false, true);
        //arrayLine();
        //simbNum();
        //coincidentalLetters();
        //printBottles();
        //count();
        //printPalindrom();

    }

    public static void printHello() {
        System.out.println("Hello World!");
    }

    public static void operationMath(int x, float y) {

        System.out.printf("Addition: %f\nSubtraction: %f\nDivision: %f\nMultiply: %f\n\n", x + y, x - y, x / y, x * y);
    }

    public static void operationBool(boolean x, boolean y) {

        System.out.printf("NOT: %b %b\nAND: %b\nOR: %b\nStrict OR: %b\nConditional AND: %b\n" +
                        "Conditional OR: %b\nEquals: %b",
                !x, !y, x & y, x | y, x ^ y, x && y, x || y, x == y);
    }

    public static void arrayLine() {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[30];
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        for (int i = 1; i <= arr.length; ++i) {
            System.out.print(arr[i-1] + "\t");
            if (i % 10 == 0 && i > 1)
                System.out.println();
        }
    }

    public static void simbNum() {

        String str = "Hello World!";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] + " " + (int) ch[i]);
        }
    }

    public static void coincidentalLetters() {

        String str = "Hello World!";
        char[] ch = str.toCharArray();
        char[] arr = new char[ch.length];
        int[] num = new int[ch.length];

        int count;
        int size = 0;
        int sizeTwo = 0;
        int check = 0;

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
            System.out.println(newArr[j] + "\t" + newNum[j]);
        }
    }

    public static void printBottles() {
        for (int i = 100; i >= 0; i--) {
            if (i % 10 > 4 || i % 10 == 0) {
                System.out.print(i + " бутылок стояло на столе, одна из них упала и разбилась. ");
            } else if (i % 10 == 1) {
                System.out.print(i + " бутылка стояла на столе, одна из них упала и разбилась. ");
            } else {
                System.out.print(i + " бутылки стояли на столе, одна из них упала и разбилась. ");
            }

        }
    }

    public static void count() {
        Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();
        //System.out.println(num);

        char a = '*';
        // int b = Integer.parseInt(String.valueOf(a));

        int c = Character.digit(a, 10);
        System.out.println(c);


    }

    public static void printPalindrom() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        char[] newCh = new char[ch.length];

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

    public static class Expressions {

        public boolean isOperation(char c) {
            return c == '+' || c == '-' || c == '/' || c == '%' || c == '*';
        }

        public boolean interval(char c) {
            return c == ' ';
        }

        public int opearatorsPriority(char operand) {
            switch (operand) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                case '%':
                    return 2;
                default:
                    return -1;
            }
        }

        public void operator(LinkedList<Integer> cislo, char znak) {
            int r = cislo.removeLast();
            int l = cislo.removeLast();
            switch (znak) {
                case '+':
                    cislo.add(l + r);
                    break;
                case '-':
                    cislo.add(l - r);
                    break;
                case '*':
                    cislo.add(l * r);
                    break;
                case '/':
                    cislo.add(l / r);
                    break;
                case '%':
                    cislo.add(l % r);
                    break;
            }
        }

        public int make(String s) {
            Expressions obj = new Expressions();
            LinkedList<Integer> h = new LinkedList<Integer>();
            LinkedList<Character> op = new LinkedList<Character>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (obj.interval(c))
                    continue;

                if (c == '(') {
                    op.add('(');
                } else if (c == ')') {
                    while (op.getLast() != '(')
                        operator(h, op.removeLast());
                    op.removeLast();
                } else if (obj.isOperation(c)) {
                    while (!op.isEmpty() && obj.opearatorsPriority(op.getLast()) >= obj.opearatorsPriority(c))
                        operator(h, op.removeLast());
                    op.add(c);
                } else {
                    String operand = "";
                    while (i < s.length() && Character.isDigit(s.charAt(i)))
                        operand += s.charAt(i++);
                    --i;
                    h.add(Integer.parseInt(operand));
                }
            }

            while (!op.isEmpty())
                operator(h, op.removeLast());
            return h.get(0);

        }

        public void start() {

            Expressions object = new Expressions();
            String s = "";
            Scanner scan = new Scanner(System.in);
            System.out.println("Напишите математическое выражение: ");
            s = scan.nextLine();

            System.out.println(object.make(s));

        }
    }

}
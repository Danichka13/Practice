public class TaskFifth {

    public static void main(String[] args) {

        simbNum();
    }

    public static void simbNum() {

        String str = "Hello World!";
        char[] ch = str.toCharArray();
        System.out.println("Посимвольный вывод строки [" + str + "] и числовой код каждого символа:");
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                System.out.println("Space = " + (int) ch[i]);
            } else {
                System.out.println(ch[i] + " = " + (int) ch[i]);
            }
        }
    }
}

public class TaskThird {

    public static void main(String[] args) {

        operationBool();
    }

    public static void operationBool() {
        boolean x = false;
        boolean y = true;

        System.out.printf("Операции с булевыми переменными [%b] [%b]:\nNOT: %b %b\nAND: %b\nOR: %b" +
                        "\nStrict OR: %b\nConditional AND: %b\nConditional OR: %b\nEquals: %b\n\n",
                x, y, !x, !y, x & y, x | y, x ^ y, x && y, x || y, x == y);
    }
}

public class TaskSecond {

    public static void main(String[] args) {

        operationMath();
    }

    public static void operationMath() {

        int x = 15;
        float y = 22.77f;
        System.out.printf("Математические операции с числом [%d] типа int и числом [%f] типа float:\n" +
                "Сложение: %f\nВычитание: %f\nДеление: %f\nУмножение: %f", x, y, x + y, x - y, x / y, x * y);
    }
}

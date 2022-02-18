public class TaskSeventh {

    public static void main(String[] args) {

        printBottles();
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
}

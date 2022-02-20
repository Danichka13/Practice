package bonusTwo;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        int flag = 0;
        List list = new List();
        Scanner scan = new Scanner(System.in);
        while (flag != 6) {
            System.out.print("Список: ");
            list.print();
            System.out.println("Выберите действие: \n1) Добавить элемент\n" +
                    "2) Вставить элемент в середину\n3) Удалить элемент по индексу\n" +
                    "4) Отсортировать список\n5) Очистить список\n6) Завершить работу");
            flag = scan.nextInt();
            switch (flag) {
                case (1): {
                    System.out.print("Введите элемент для добавления: ");
                    int data = scan.nextInt();
                    list.add(data);
                    break;
                }
                case (2): {
                    System.out.print("Введите элемент для вставки в середину: ");
                    int data = scan.nextInt();
                    list.addInDiffPlace(list.length() / 2 + 1, data);
                    break;
                }
                case (3): {
                    System.out.print("Введите индекс для удаления: ");
                    int data = scan.nextInt();
                    list.removeByIndex(data);
                    break;
                }
                case (4): {
                    list.sort();
                    break;
                }
                case (5): {
                    list.clear();
                    break;
                }
                case (6): {
                    break;
                }
                default: {
                    System.out.println("Неверно введён номер");
                }
            }
        }
    }
}

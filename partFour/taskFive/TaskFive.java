package partFour.taskFive;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scan.nextInt();

        ElementFibonacci el = (x) -> {
            RowFibonacci row = (y) -> {
                ArrayList<Long> arr = new ArrayList();
                long temp = 0;
                long first = 0;
                long second = 1;

                arr.add(first);
                arr.add(second);
                while (temp < y) {
                    temp = first + second;
                    first = second;
                    second = temp;
                    arr.add(temp);
                }
                return arr;
            };

            ArrayList<Long> arr = row.array(x);
            for (int i = 0; i < arr.size(); i++){
                if(x == arr.get(i)){
                    return true;
                }
            }
            return false;
        };

        System.out.println(el.elem(num));
    }
}

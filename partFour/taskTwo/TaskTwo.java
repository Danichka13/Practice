package partFour.taskTwo;

import java.util.*;
import java.util.stream.Collectors;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элементы массива через пробел:");
        String str = scan.nextLine();

        String[] arrStr = str.split(" ");
        Sentence sentence = new Sentence(arrStr);

        Delete delDup = (sent) ->
                sent.getStringWords().stream().distinct().collect(Collectors.toList());
        /*{
        //Тут дубликаты удаляются, но слова становятся в перемешку
            ArrayList<String> list = new ArrayList<String>(sent.getStringWords());
            Set<String> set = new HashSet<>(list);
            list.clear();
            list.addAll(set);
            return list;
        };*/
        String[] sentWithoutDup = delDup.deleteDuplicate(sentence).stream().toArray(String[]::new);
        Sentence newSent = new Sentence(sentWithoutDup);
        System.out.println("После удаления дубликатов: " + newSent.getOriginalSentence());
    }
}

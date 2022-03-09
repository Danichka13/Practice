package partFour.taskSeven;

import partFour.taskTwo.Delete;
import partFour.taskTwo.Sentence;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskSeven {
    //private static final List<Character> vowels = Arrays.asList('а','о', 'э', 'е', 'и', 'ы', 'у', 'ё', 'ю', 'я');
    private static final char[] vowels = {'а', 'о', 'э', 'е', 'и', 'ы', 'у', 'ё', 'ю', 'я'};

    public static void main(String[] args) throws FileNotFoundException {
        Scanner path = new Scanner(System.in);
        System.out.println("Введите путь файла");
        String filePath = path.nextLine();

        //String filePath = "Z:\\Daniil\\JavaProject\\Practice\\src\\partFour\\taskSeven\\text.txt";
        String sentWords = "";
        Sentence sentence = null;
        try (FileReader fileReader = new FileReader(filePath)) {
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNext()) {
                sentWords += scan.next() + " ";
            }
            sentence = new Sentence(sentWords);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        Delete delDup = (sent) ->
                sent.getStringWords().stream().distinct().collect(Collectors.toList());

        String[] sentWithoutDup = delDup.deleteDuplicate(sentence).stream().toArray(String[]::new);
        Sentence newSent = new Sentence(sentWithoutDup);
        System.out.println("После удаления дубликатов: " + newSent.getOriginalSentence());

        analizator(sentence);
        System.out.println("Great!");
    }

    public static void analizator(Sentence sentence) {
        int countWord = 0, countV = 0, countC = 0;

        Counter<Integer> countingWord = (count) -> sentence.getWordsCount();

        Counter<Integer> countingVowels = (count) -> {
            for (int i = 1; i <= sentence.getWordsCount(); i++) {
                for (int j = 0; j < vowels.length; j++) {
                    if (vowels[j] == sentence.getWordByPosition(i).getOriginalWord().toLowerCase().charAt(0)) {
                        count++;
                    }
                }
            }
            return count;
        };

        Counter<Integer> countingConsonant = (count) -> {
            for (int i = 1; i <= sentence.getWordsCount(); i++) {
                for (int j = 0; j < vowels.length; j++) {
                    if (vowels[j] != sentence.getWordByPosition(i).getOriginalWord().toLowerCase().charAt(0)) {
                        System.out.println(sentence.getWordByPosition(i).getOriginalWord().toLowerCase().charAt(0));
                        count++;
                    }
                }
                count -= vowels.length-1;
            }
            return count;
        };

        try (FileWriter fileWriter = new FileWriter("Z:\\Daniil\\JavaProject\\Practice\\src\\partFour\\taskSeven\\result.txt")) {
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Анализ текста.\nВсего слов - " + countingWord.counting(countWord) +
                    "\nИз них:\nс гласной - " + countingVowels.counting(countV) +
                    "\nс согласной - " + countingConsonant.counting(countC));
        } catch (IOException ex) {
            System.out.println("ЕМАЁ!");
            ex.getLocalizedMessage();
        }
    }

}

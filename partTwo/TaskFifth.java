package partTwo;

import java.util.Scanner;

public class TaskFifth {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Sentence testSent = new Sentence(str.split(" "));

        System.out.println(testSent.getWordsCount());
        System.out.println(testSent.getOriginalSentence());
        System.out.println(testSent.getWordByPosition(2).getOriginalWord());

        Word testWord = new Word(str.split(" ")[2]);
        System.out.println(testWord.getSybmolCount());
        System.out.println(testWord.getOriginalWord());

    }
}


class Word {

    private char[] word;

    public Word(String strWord) {
        if (strWord == null || "".equals(strWord.trim())) {
            throw new IllegalArgumentException("Слово не может быть пустым");
        }
        word = strWord.toCharArray();
    }

    public int getSybmolCount() {
        return word.length;
    }

    public String getOriginalWord() {
        String str = "";
        for (int i = 0; i < word.length; i++) {
            str += word[i];
        }
        return str;
    }
}

class Sentence {

    private Word[] words;

    public Sentence(String[] str) {
        words = new Word[str.length];
        for (int i = 0; i < str.length; i++) {
            words[i] = new Word(str[i]);
        }
    }

    public int getWordsCount() {
        return words.length;
    }

    public String getOriginalSentence() {
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str += words[i].getOriginalWord() + " ";
        }
        return str;
    }

    public Word getWordByPosition(int pos) {
        return words[pos - 1];
    }
}



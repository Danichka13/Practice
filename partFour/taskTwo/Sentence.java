package partFour.taskTwo;

import java.util.ArrayList;

public class Sentence {

    private ArrayList<Word> words = new ArrayList<Word>();

    public Sentence(ArrayList<Word> words) {
        this.words = words;
    }

    public Sentence(String words) {
        String[] arrWords = words.split(" ");
        for (String arrWord : arrWords) {
            this.words.add(new Word(arrWord));
        }
    }

    public Sentence(String[] words) {
        for (String word : words) {
            this.words.add(new Word(word));
        }
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    public void setWordsStr(String words) {
        String[] arrWords = words.split(" ");
        ArrayList<Word> temp = new ArrayList<Word>();
        for (String arrWord : arrWords) {
            temp.add(new Word(arrWord));
        }
        this.words = temp;
    }

    public ArrayList<String> getStringWords() {
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 1; i <= getWordsCount(); i++) {
            words.add(getWordByPosition(i).getOriginalWord());
        }
        return words;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public int getWordsCount() {
        return words.size();
    }

    public String getOriginalSentence() {
        String str = "";
        for (Word word : words) {
            str += word.getOriginalWord() + " ";
        }
        return str.substring(0, str.lastIndexOf(" "));
    }

    public Word getWordByPosition(int pos) {
        return words.get(pos - 1);
    }
}
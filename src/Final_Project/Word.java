package Final_Project;

import java.util.ArrayList;

public class Word  {
    // Variables
    private String word;
    private int length;
    private ArrayList<Letter> letters = new ArrayList<Letter>();

    // Constructors
    public Word(String word) {
        this.word = word;
        this.length = word.length();
        for (int i = 0; i < this.length; i++) {
            letters.add(new Letter(word.substring(i, i + 1)));
        }
    }

    // Accessors
    public String getWord() {
        return word;
    }
    public int getLength() {
        return length;
    }
    public ArrayList<Letter> getLetters() {
        return letters;
    }
    public Letter getLetter(int i) {
        return letters.get(i);
    }
}

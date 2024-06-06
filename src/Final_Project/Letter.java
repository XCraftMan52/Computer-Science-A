package Final_Project;

public class Letter {
    private String charector;
    private boolean in_word;
    private boolean correct_idx;

    public Letter(String charector) {
        this.charector = charector;
        this.in_word = false;
        this.correct_idx = false;
    }
    public Letter() {
        this.charector = "";
        this.in_word = false;
        this.correct_idx = false;
    }
    public String getCharector() {
        return charector;
    }
    public boolean isInWord() {
        return in_word;
    }
    public boolean isCorrectIdx() {
        return correct_idx;
    }
    public void setInWord(boolean in_word) {
        this.in_word = in_word;
    }
    public void setCorrectIdx(boolean correct_idx) {
        this.correct_idx = correct_idx;
    }


}

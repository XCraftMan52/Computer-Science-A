package Final_Project;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public Player() {
        this.name = "Player";
        this.score = 0;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

}

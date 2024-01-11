package Objects.Dice_Roll;

public class Die {
    // Variables
    private int numsides;

    // Constructors
    public Die(int sides) {
        numsides = sides;
    }
    public Die() {
        numsides = 1;
    }

    //Methods
    public int roll() {
        return (int)((Math.random() * numsides) + 1);
    }
    
}

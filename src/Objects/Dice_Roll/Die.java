package Objects.Dice_Roll;

public class Die {
    // Variables
    private int numsides;

    // Constructors
    public Die(int numsides) {
        this.numsides = numsides;
    }
    public Die() {
        numsides = 6;
    }

    //Methods
    public int getNumSides() {
        return numsides;
    }
    public int roll() {
        return (int)((Math.random() * numsides) + 1);
    }
    
}

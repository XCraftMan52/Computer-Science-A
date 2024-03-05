
package Array_Lists.Poker;
public class Card {
    public int suit; //1 = Heart, 2 = Diamond, 3 = Club, 4 = Spade
    public String suit_icon;
    public String suit_value;
    public int value; //1 = Ace, 2-10 Numerical, 11 = Jack, 12 = Queen, 13 = King

    public Card(int suit, int value)
    {
        if (suit >= 1 && suit <= 4) {
            this.suit = suit;
            this.suit_icon = suit == 1 ? "♥" : suit == 2 ? "♦" : suit == 3 ? "♣" : "♠";
        }
        if (value >= 1 && value <= 13){
            this.value = value;
            this.suit_value = value == 1 ? "A" : value == 11 ? "J" : value == 12 ? "Q" : value == 13 ? "K" : Integer.toString(value);
        }
    }
    public Card() {
        suit = 4;
        suit_icon = "♠";
        suit_value = "A";
        value = 1;

    }
    public String cardName(){
        String name = "";
        if (value == 1) {
            name += "Ace";
        }
        if (value >= 2 && value <= 10) {
            name += Integer.toString(value);
        }
        if (value == 11){
            name += "Jack";
        }
        if (value == 12){
            name += "Queen";
        }
        if (value == 13){
            name += "King";
        }
        name += " of ";
        switch(suit){
            case 1:
                name += "Hearts";
                break;
            case 2:
                name += "Diamonds";
                break;
            case 3:
                name += "Clubs";
                break;
            case 4:
                name += "Spades";
                break;
        }
        return name;
    }

}
package Array_Lists.Poker;
import java.util.*;

public class PokerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Video Poker!\nInsert Money: ");
        int money = input.nextInt();
        System.out.println("You are starting with " + money + " credits. What would you like to do? (Enter 1 - 3)\n 1. Insert Money\n 2. View Machine Payouts\n 3. Bet\n 4. Cash Out");
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Please enter a valid choice.");
            choice = input.nextInt();
        }
        while (choice != 4) {
        switch (choice) {
            case 1:
                System.out.println("How much money would you like to insert?");
                int insert = input.nextInt();
                money += insert;
                break;

            case 2:
                System.out.println("The payouts for this machine are:\nRoyal Flush: 250 * bet (Jackpot bet of 5: 4000)\nStraight Flush: 50 * bet\n4 of a Kind: 25 * bet\nFull House: 8 * bet\nFlush: 5 * bet\nStraight: 4 * bet\n3 of a Kind: 3 * bet\n2 Pair: 2 * bet\nJacks or Better: 1 * bet\n");
                break;
            case 3:
                System.out.println("Bet how many credits (1-5)?");
                ArrayList<Card> deck = newDeck();
                ArrayList<Card> hand = new ArrayList<Card>();

        for (int i = 0; i < 5; i++) {
            int index = (int) (deck.size() * Math.random());
            hand.add(deck.get(index));
            deck.remove(index);
        }
                int bet = input.nextInt();
                while (bet < 1 || bet > 5) {
                    System.out.println("Please enter a valid bet.");
                    bet = input.nextInt();
                }
                while (money < bet) {
                    System.out.println(bet + " is more than you have. Please enter a valid bet.");
                    bet = input.nextInt();

                }
                System.out.println("Bet of " + bet + " credits confirmed.");
                money -= bet;
                System.out.println("The 5 cards in your hand are: ");
                printDeck(hand);
                System.out.println("Select which cards to hold (Enter 0 to draw again):");
                boolean[] holdStatus = new boolean[5];
                for (int i = 0; i < 5; i++){
                   holdStatus[i] = false;
                }
                System.out.println("0 - DRAW");
                for (int i = 0; i < hand.size(); i++){
                    String hold = "NOT HELD";
                    if (holdStatus[i]){
                        hold = "HELD";
                    }
                    System.out.println((i+1) + " - " + hand.get(i).cardName() + " - " + hold);
                }
                int holdInput = input.nextInt();
                while (holdInput != 0) {
                    holdStatus[holdInput - 1] = !holdStatus[holdInput - 1];
                    System.out.println("0 - DRAW");
                    for (int i = 0; i < hand.size(); i++){
                        String hold = "NOT HELD";
                        if (holdStatus[i]){
                            hold = "HELD";
                        }
                        System.out.println((i+1) + " - " + hand.get(i).cardName() + " - " + hold);
                    }
                    holdInput = input.nextInt();
                }
                int count = 0;
                for (int i = 0; i < 5; i++){
                    if (!holdStatus[i]){
                        count++;
                        hand.set(i, deck.get((int) (deck.size() * Math.random())));
                    }
                }
                System.out.println("Drawing " + count  + " new cards...");
                System.out.println("The 5 cards in your hand are: ");
printDeck(hand);
                String winType = winType(hand);
                int value = handValue(hand);
                money += value * bet;
                System.out.println("Hand result: " + winType + ". Payout: " + value * bet + " credits\n");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        System.out.println("You have "+ money + ". What would you like to do? (Enter 1 - 3)\n 1. Insert Money\n 2. View Machine Payouts\n 3. Bet\n 4. Cash Out");
        choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Please enter a valid choice.");
            choice = input.nextInt();
        }

    }
     System.out.println("Printing voucher for " + money + " credits. Thanks for playing");
    input.close();
    }
    // Returns a new deck of cards
    public static ArrayList<Card> newDeck(){
        ArrayList<Card> deck = new ArrayList<Card>();
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 13; j++){
                deck.add(new Card(i, j));
            }
        }
        return deck;
    }
    // Returns true if the hand is a royal flush
    public static boolean royalFlush(ArrayList<Card> hand) {
        return straightFlush(hand) && hand.get(0).value == 1 && hand.get(1).value == 10;
    }
    // Returns true if the hand is a straight flush
    public static boolean straightFlush(ArrayList<Card> hand) {
        return flush(hand) && straight(hand);
    }
    // Returns true if the hand is a flush
    public static boolean flush(ArrayList<Card> hand) {
        int suit = hand.get(0).suit;
        for (int i = 1; i < hand.size(); i++) {
            if (hand.get(i).suit != suit) {
                return false;
            }
        }
        return true;
    }
    // Returns true if the hand is a straight
    public static boolean straight(ArrayList<Card> hand) {
        Collections.sort(hand, new Comparator<Card>() {
            public int compare(Card c1, Card c2) {
                return c1.value - c2.value;
            }
        });
        for (int i = 1; i < hand.size(); i++) {
            if (hand.get(i).value != hand.get(i-1).value + 1) {
                return false;
            }
        }
        return true;
    }
    // Returns true if the hand is a 4 of a kind
    public static boolean fourOfAKind(ArrayList<Card> hand) {
        for (int i = 0; i < hand.size(); i++) {
            int count = 0;
            for (int j = 0; j < hand.size(); j++) {
                if (hand.get(i).value == hand.get(j).value) {
                    count++;
                }
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }
    // Returns true if the hand is a full house
    public static boolean fullHouse(ArrayList<Card> hand) {
        return threeOfAKind(hand) && onePair(hand);
    }
    // Returns true if the hand is a 3 of a kind
    public static boolean threeOfAKind(ArrayList<Card> hand) {
        for (int i = 0; i < hand.size(); i++) {
            int count = 0;
            for (int j = 0; j < hand.size(); j++) {
                if (hand.get(i).value == hand.get(j).value) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
    // Returns true if the hand is a 2 pair
    public static boolean twoPair(ArrayList<Card> hand) {
        int pairCount = 0;
        for (int i = 0; i < hand.size(); i++) {
            int count = 0;
            for (int j = 0; j < hand.size(); j++) {
                if (hand.get(i).value == hand.get(j).value) {
                    count++;
                }
            }
            if (count == 2) {
                pairCount++;
            }
        }
        return pairCount == 2;
    }
    // Returns true if the hand is a 1 pair
    public static boolean onePair(ArrayList<Card> hand) {
        for (int i = 0; i < hand.size(); i++) {
            int count = 0;
            for (int j = 0; j < hand.size(); j++) {
                if (hand.get(i).value == hand.get(j).value) {
                    count++;
                }
            }
            if (count == 2) {
                return true;
            }
        }
        return false;
    }
    // Returns the value of the hand and the type of win to a winType String vARIABLE
    public static int handValue(ArrayList<Card> hand) {
        if (royalFlush(hand)) {
            return 250;
        }
        if (straightFlush(hand)) {
            return 50;
        }
        if (fourOfAKind(hand)) {
            return 25;
        }
        if (fullHouse(hand)) {
            return 8;
        }
        if (flush(hand)) {
            return 5;
        }
        if (straight(hand)) {
            return 4;
        }
        if (threeOfAKind(hand)) {
            return 3;
        }
        if (twoPair(hand)) {
            return 2;
        }
        if (onePair(hand)) {
            return 1;
        }

        return 0;
    }
    // returns the type of win as a String
    public static String winType(ArrayList<Card> hand) {
        if (royalFlush(hand)) {
            return "Royal Flush";
        }
        if (straightFlush(hand)) {
            return "Straight Flush";
        }
        if (fourOfAKind(hand)) {
            return "4 of a Kind";
        }
        if (fullHouse(hand)) {
            return "Full House";
        }
        if (flush(hand)) {
            return "Flush";
        }
        if (straight(hand)) {
            return "Straight";
        }
        if (threeOfAKind(hand)) {
            return "3 of a Kind";
        }
        if (twoPair(hand)) {
            return "2 Pair";
        }
        if (onePair(hand)) {
            return "Jacks or Better";
        }
        return "No Win";
    }
    // Prints the Current Deck as ASCII
    public static void printDeck(ArrayList<Card> hand) {    
         for (int i = 0; i < hand.size(); i++) {
                System.out.print("+------+  ");
            }
            System.out.println();

            for (int i = 0; i < hand.size(); i++) {
                System.out.print("|" + formatCardValue(hand.get(i).suit_value) + "    |  ");
            }
            System.out.println();
                for (int i = 0; i < hand.size(); i++) {
                System.out.print("|      |  ");
            }
            System.out.println();
            for (int i = 0; i < hand.size(); i++) {
                System.out.print("|  " + hand.get(i).suit_icon + "   |  ");
            }
            System.out.println();
                for (int i = 0; i < hand.size(); i++) {
                System.out.print("|      |  ");
            }
            System.out.println();
            for (int i = 0; i < hand.size(); i++) {
                
                System.out.print("|    " + formatCardValue(hand.get(i).suit_value) + "|  ");
            }
            System.out.println();

            for (int i = 0; i < hand.size(); i++) {
                System.out.print("+------+  ");
            }
            System.out.println();
        
    }
    // Formats the card value to be printed as ASCII
    public static String formatCardValue(String value) {
    if (value.length() == 1) {
        return value + " ";
    } else {
        return value;
    }
}
}
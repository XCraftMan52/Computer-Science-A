package Objects.Ticket_Sales;
import java.io.*; 
import java.util.Scanner;

public class TicketSales {
    public static void main(String[] args) throws IOException {
        Show[] shows = createShowsArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! These are the shows currently playing:");
        System.out.println("Here are the shows available for purchase:");
        for (int i = 0; i < shows.length; i++) {
            System.out.println((i + 1) + ". " + shows[i].getShowName() + " at " + shows[i].getVenue() + " - " + shows[i].getNumTickets() + " tickets available at $" + shows[i].getTicketPrice() + " each.");
        }
         System.out.println("How much money do you have to spend on Broadway tickets?");
         double money = input.nextDouble();
         while (money < 0) {
             System.out.println("Please enter a valid amount of money.");
             money = input.nextDouble();
         }
         System.out.println("MAIN MENU: what would you like to do?\n1. Display current shows\n2. Check Ticket avalability\n3. Purchase Tickets\n4. Exit");
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Please enter a valid choice.");
            choice = input.nextInt();
        }
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Here are the shows available for purchase:");
                    for (int i = 0; i < shows.length; i++) {
                            System.out.println((i + 1) + ". " + shows[i].getShowName() + " at " + shows[i].getVenue() + " - " + shows[i].getNumTickets() + " tickets available at $" + shows[i].getTicketPrice() + " each.");
                        }
                    break;
                case 2:
                    System.out.print("Which show would you like to check the ticket availability for? (");
                    for (int i = 0; i < shows.length; i++) {
                       if (i == shows.length - 1) {
                            System.out.println((i + 1) + " = " + shows[i].getShowName() + ")");
                        } else {
                        System.out.print((i + 1) + " = " + shows[i].getShowName() + ", ");
                        }
                    }
                    int showChoice = input.nextInt();
                     while (showChoice < 1 || showChoice > shows.length) {
                            System.out.println("Please enter a valid show number.");
                            showChoice = input.nextInt();
                        }
                      System.out.println("There are " + shows[showChoice - 1].getNumTickets() + " tickets available for " + shows[showChoice - 1].getShowName() + " at " + shows[showChoice - 1].getVenue() + ".");
                        break;
                case 3:
                        System.out.println("Which show would you like to purchase tickets for?");
                        int showPurchase = input.nextInt();
                        while (showPurchase < 1 || showPurchase > shows.length) {
                            System.out.println("Please enter a valid show number.");
                            showPurchase = input.nextInt();
                        }
                        System.out.println("How many tickets would you like to purchase?");
                        int numTickets = input.nextInt();
                        while (numTickets < 1 || numTickets > shows[showPurchase - 1].getNumTickets()) {
                            System.out.println("Please enter a valid number of tickets.");
                            numTickets = input.nextInt();
                        }
                        if (numTickets * shows[showPurchase - 1].getTicketPrice() > money) {
                            System.out.println("You do not have enough money to purchase " + numTickets + " tickets for " + shows[showPurchase - 1].getShowName() + " at " + shows[showPurchase - 1].getVenue() + ".");
                        } else {
                        System.out.println("You have chosen to purchase " + numTickets + " tickets for " + shows[showPurchase - 1].getShowName() + " at " + shows[showPurchase - 1].getVenue() + ". The total cost is $" + (numTickets * shows[showPurchase - 1].getTicketPrice()) + ". Is this okay? (y/n)");
                        String confirm = input.next();
                        while (!confirm.equalsIgnoreCase("y") && !confirm.equalsIgnoreCase("n")) {
                            System.out.println("Please enter a valid response.");
                            confirm = input.next();
                        }
                    }
                    }
                      System.out.println("MAIN MENU: what would you like to do?\n1. Display current shows\n2. Check Ticket avalability\n3. Purchase Tickets\n4. Exit");
                        choice = input.nextInt();
                        while (choice < 1 || choice > 4) {
                            System.out.println("Please enter a valid choice.");
                            choice = input.nextInt();
                        }
                }
                System.out.println("Thank you for using the Broadway Ticket Sales Program!");
                input.close();
    }


public static Show[] createShowsArray() throws IOException {

  String fileName = new String("./src/Objects/Ticket_Sales/ShowNames.txt");
//   String fileName = new String("ShowNames.txt");


  File inFile = new File(fileName);
  Scanner textInput = new Scanner(inFile); //notice the Scanner is not referencing System.in, as it is now reading input from a different source.
  int numLines = 0;
  while (textInput.hasNextLine())
  {
     numLines++;
		textInput.nextLine();
  }
  	textInput = new Scanner(inFile);
  Show[] shows = new Show[numLines];
  for (int lineCount = 0; lineCount < shows.length; lineCount++)
  {
     shows[lineCount] = new Show(); //initialize each Show object
     //getter and setter names below may have to be adjusted based on your individual program
     shows[lineCount].setShowName(textInput.next().replace('_', ' '));
     shows[lineCount].setVenue(textInput.next().replace('_', ' '));
     shows[lineCount].setNumTickets(textInput.nextInt());
     shows[lineCount].setTicketPrice(textInput.nextDouble());
   }
  textInput.close();
  
  return shows; //returns the shows array, now filled with info
}

    
}
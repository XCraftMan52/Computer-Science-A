package Objects.Ticket_Sales;

public class Show {
    // Variables
    private String name;
    private String venue;
    private int numTickets;
    private double ticketPrice;

    // Constructors
    public Show(String name, String venue, int numTickets, double ticketPrice) {
        this.name = name;
        this.venue = venue;
        this.numTickets = numTickets;
        this.ticketPrice = ticketPrice;
    }
    public Show() {
        this.name = "No Name";
        this.venue = "No Venue";
        this.numTickets = 0;
        this.ticketPrice = 0.0;
    }

    // Accessors and Mutators
    public String getShowName() {
        return name;
    }
    public void setShowName(String name) {
        this.name = name;
    }
    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public int getNumTickets() {
        return numTickets;
    }
    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    //Methods
    public boolean buyTickets(int number, double money) {
        if (number > numTickets) {
            return false;
        }
        if (money < number * ticketPrice) {
            return false;
        }
        numTickets -= number;
        return true;
    }
    public boolean isSoldOut() {
        return numTickets == 0;
    }
    public void displayShowInfo() {
        System.out.println("Show: " + name);
        System.out.println("Venue: " + venue);
        System.out.println("Number of Tickets: " + numTickets);
        System.out.println("Ticket Price: " + ticketPrice);
    }


}

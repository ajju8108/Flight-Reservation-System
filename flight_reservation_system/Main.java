package flight_reservation_system;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Passenger passenger = new Passenger("Maharashtra", "Mumbai", "Andheri", "Ajay", "+8108773262", "ajaymaurya199618@gmail.com");
        Flight flight = new Flight("FL587AAB", "Kingfisher", 40, 38);
        RegularTicket regularTicket = new RegularTicket("PNRRT8745", "Mumbai", "Lucknow", flight, "Kingfisher", "10:05", passenger, "6:55", 7878.5F, false);
        TouristTicket tourist = new TouristTicket("PNRTT3665", "Mumbai", "kolkata", flight, "Kingfisher", "10:05", passenger, "6:55", 7878.5F, false);
        printTicketDetails(regularTicket);
        printTicketDetails(tourist);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}

package flight_reservation_system;

public abstract class Ticket {
    private String pnr;
    private String departureLoaction;
    private String destinationLocation;
    private Flight flight;
    private String dateTimeDeparture;
    private String dateTimeArrival;
    private Passenger pass;
    private String seatNO;
    private float price;
    private boolean cancelled;

    public Ticket(String pnr, String from, String to, Flight fl, String departureDateTime, String arrivalDateTime, Passenger pa, String seatNO, float price, boolean cancelled) {
        this.pnr = pnr;
        this.departureLoaction = from;
        this.destinationLocation = to;
        this.flight = fl;
        this.dateTimeDeparture = departureDateTime;
        this.dateTimeArrival = arrivalDateTime;
        this.pass = pa;
        this.seatNO = seatNO;
        this.price = price;
        this.cancelled = cancelled;
    }

    public String getPnr() {
        return this.pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return this.departureLoaction;
    }

    public void setFrom(String departureLoaction) {
        this.departureLoaction = departureLoaction;
    }

    public String getTo() {
        return this.destinationLocation;
    }

    public void setTo(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public void setFlight(Flight fl) {
        this.flight = flight;
    }

    public String getDateTimeDeparture() {
        return this.dateTimeDeparture;
    }

    public void setDateTimeDeparture(String dateTimeDeparture) {
        this.dateTimeDeparture = dateTimeDeparture;
    }

    public String getDateTimeArrival() {
        return this.dateTimeArrival;
    }

    public void setArrivalDateTime(String dateTimeArrival) {
        this.dateTimeArrival = dateTimeArrival;
    }

    public Passenger getPass() {
        return this.pass;
    }

    public void setPa(Passenger pa) {
        this.pass = pass;
    }

    public String getSeatNO() {
        return this.seatNO;
    }

    public void setSeatNO(String seatNO) {
        this.seatNO = seatNO;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String checkStatus() {
        return this.cancelled ? "Cancelled" : "Confirmed";
    }

    public int getFlightDuration() {
        int duration = Integer.parseInt(this.dateTimeDeparture) - Integer.parseInt(this.dateTimeArrival);
        return duration;
    }

    public void cancel() {
        this.cancelled = true;
    }
}


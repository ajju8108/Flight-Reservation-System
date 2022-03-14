package flight_reservation_system;

public class Flight {
    private String trackFlightNumber;
    private String airline;
    private int capacity;
    private int numberOfSeatsBooked;

    public Flight(String trackFlightNumber, String airline, int capacity, int numberOfSeatsBooked) {
        this.trackFlightNumber = trackFlightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.numberOfSeatsBooked = numberOfSeatsBooked;
    }

    public String gettrackFlightNumber() {
        return this.trackFlightNumber;
    }

    public void settrackFlightNumber(String trackFlightNumber) {
        this.trackFlightNumber = trackFlightNumber;
    }

    public String getAirline() {
        return this.airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getnumberOfSeatsBooked() {
        return this.numberOfSeatsBooked;
    }

    public void setnumberOfSeatsBooked(int numberOfSeatsBooked) {
        this.numberOfSeatsBooked = numberOfSeatsBooked;
    }

    public String getFlightDetails() {
        return "Flight No: " + this.trackFlightNumber + ", Airline: " + this.airline + ", Capacity: " + this.capacity + ", Booked Seats: " + this.numberOfSeatsBooked;
    }

    public boolean checkAvailability() {
        return this.getnumberOfSeatsBooked() != this.getCapacity();
    }

    public void updateBookingCounter() {
        this.setnumberOfSeatsBooked(this.getnumberOfSeatsBooked() + 1);
    }
}


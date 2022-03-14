package flight_reservation_system;

class Address {
    String street;
    String city;
    String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public Address() {
        this("MGM school", "Virar", "Mumbai");
    }
}
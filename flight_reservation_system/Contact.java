package flight_reservation_system;

class Contact {
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Contact() {
        this("Ajay", "8108773262", "ajaymaurya199618@gmail.com");
    }
}
package flight_reservation_system;

public class Passenger {
    private static Passenger.Address address;
    private static Passenger.Contact contact;
    

    public Passenger(String addressState, String addressCity, String addressStreet, String contactName, String contactPhone, String contactEmail) {
        address = new Passenger.Address(addressState, addressCity, addressStreet);
        contact = new Passenger.Contact(contactName, contactPhone, contactEmail);
      
    }

    public Passenger() {
        this("Maharashtra", "Virar", "Mgm school", "Ajay Maurya", "8108773262", "ajaymaurya199618@gmail.com");
    }

    public String getAddressDetails() {
        return "Passenger address: " + address.state + " " + address.city + " " + address.street;
    }

    public void updateAddressDetails(String addressDetail) {
        addressDetail = this.getAddressDetails();
    }

    public String getContactDetails() {
        return "Passenger name : " + contact.name + " EmailId: " + contact.email + " Phone Number : " + contact.phone;
    }

    public void updateContactDetails(String contactDetail) {
        contactDetail = this.getContactDetails();
    }

    private static class Contact {
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

    private static class Address {
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
}


package flight_reservation_system;

public class TouristTicket extends Ticket {
    private String hotelAddress = "Taj lands here bandra";
    private String[] touristLocation = new String[5];

    public TouristTicket(String pnr, String departureLoaction, String destinationLocation, Flight flight, String dateTimeDeparture, String dateTimeArrival, Passenger pass, String seatNO, float price, boolean cancelled) {
        super(pnr, departureLoaction, destinationLocation, flight, dateTimeDeparture, dateTimeArrival, pass, seatNO, price, cancelled);
    }

    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public String[] getTouristLocations() {
        for(int i = 0; i < 5; ++i) {
            System.out.println(this.touristLocation[i]);
        }

        return this.touristLocation;
    }

    public void removeTouristLocations(String location) {
        int index = Integer.parseInt(location);
        int[] array = new int[this.touristLocation.length - 1];

        for(int i = 0; i < this.touristLocation.length; ++i) {
            if (i != index) {
                array[i] = Integer.parseInt(this.touristLocation[i]);
            }
        }

    }

    public void addTouristLocations(String location) {
        int index = Integer.parseInt(location);
        int[] array2 = new int[this.touristLocation.length + 1];

        for(int i = 0; i < this.touristLocation.length; ++i) {
            if (i != index) {
                array2[i] = Integer.parseInt(this.touristLocation[i]);
            }
        }

    }
}

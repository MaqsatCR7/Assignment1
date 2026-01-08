public class Booking {

    private Guest guest;
    private Room room;
    private int nights;

    public Booking(Guest guest, Room room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
    }

    public double getTotalPrice() {
        return room.getPricePerNight() * nights;
    }

    public void displayInfo() {
        System.out.println(
                "Booking: " + guest.getName() +
                        ", Room: " + room.getRoomNumber() +
                        ", Nights: " + nights +
                        ", Total: " + getTotalPrice()
        );
    }
}

public class Booking {
    private Guest guest;
    private Room room;
    private int nights;
    private double totalPrice;

    // Constructor
    public Booking(Guest guest, Room room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.totalPrice = calculateTotalPrice();
    }

    // Getters and Setters
    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
        this.totalPrice = calculateTotalPrice(); // recalculate when nights change
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Method to calculate total price
    public double calculateTotalPrice() {
        return room.getPricePerNight() * nights;
    }

    // Method to display booking info
    public void displayInfo() {
        System.out.println("Booking for " + guest.getName() +
                " | Room #" + room.getRoomNumber() +
                " | Nights: " + nights +
                " | Total price: " + totalPrice);
    }
}

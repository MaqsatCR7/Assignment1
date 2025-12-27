import java.util.Objects;

public class Booking implements Reservable {
    private int bookingId;
    private Guest guest;
    private Room room;
    private int nights;

    public Booking(int bookingId, Guest guest, Room room, int nights) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
        this.nights = nights;
    }

    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public Guest getGuest() { return guest; }
    public void setGuest(Guest guest) { this.guest = guest; }

    public Room getRoom() { return room; }
    public void setRoom(Room room) { this.room = room; }

    public int getNights() { return nights; }
    public void setNights(int nights) { this.nights = nights; }

    public double getTotalPrice() {
        return room.calculatePrice() * nights;
    }

    @Override
    public void reserve() {
        if (room.isAvailable()) {
            room.setAvailable(false);
            System.out.println("Room " + room.getRoomNumber() + " reserved for " + guest.getName());
        } else {
            System.out.println("Room " + room.getRoomNumber() + " is not available.");
        }
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", guest=" + guest.getName() +
                ", room=" + room.getRoomNumber() +
                ", nights=" + nights +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId);
    }
}

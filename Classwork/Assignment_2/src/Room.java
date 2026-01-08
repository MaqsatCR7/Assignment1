public class Room extends Parent {

    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean available;

    public Room(int roomNumber, String roomType, double pricePerNight, boolean available) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.available = available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Room " + roomNumber +
                        ", Type: " + roomType +
                        ", Price: " + pricePerNight +
                        ", Available: " + available
        );
    }
}

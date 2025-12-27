public class LuxuryRoom extends Room {
    private boolean hasJacuzzi;

    public LuxuryRoom(int roomNumber, double pricePerNight, boolean available, boolean hasJacuzzi) {
        super(roomNumber, "Luxury", pricePerNight, available);
        this.hasJacuzzi = hasJacuzzi;
    }

    public boolean hasJacuzzi() { return hasJacuzzi; }
    public void setHasJacuzzi(boolean hasJacuzzi) { this.hasJacuzzi = hasJacuzzi; }

    @Override
    public double calculatePrice() {
        // Polymorphism: adds extra cost for Jacuzzi
        return super.calculatePrice() + (hasJacuzzi ? 5000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + " | hasJacuzzi=" + hasJacuzzi;
    }
}

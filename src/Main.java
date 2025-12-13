public class Main {
    public static void main(String[] args) {

        // Create rooms
        Room room1 = new Room(101, "Standard", 15000, true);
        Room room2 = new Room(202, "Deluxe", 25000, true);
        Room room3 = new Room(303, "Luxury", 40000, false);

        // Create guests
        Guest guest1 = new Guest("Maksat", 21, "+77001234567");
        Guest guest2 = new Guest("Aruzhan", 20, "+77007654321");

        // Create bookings
        Booking booking1 = new Booking(guest1, room1, 3);
        Booking booking2 = new Booking(guest2, room2, 2);

        // Output rooms
        System.out.println("=== Rooms ===");
        room1.displayInfo();
        room2.displayInfo();
        room3.displayInfo();

        // Output guests
        System.out.println("\n=== Guests ===");
        guest1.displayInfo();
        guest2.displayInfo();

        // Output bookings
        System.out.println("\n=== Bookings ===");
        booking1.displayInfo();
        booking2.displayInfo();

        // Compare rooms by price
        System.out.println("\n=== Compare room prices ===");
        if (room1.getPricePerNight() > room2.getPricePerNight()) {
            System.out.println("Room " + room1.getRoomNumber() + " is more expensive than Room " + room2.getRoomNumber());
        } else if (room1.getPricePerNight() < room2.getPricePerNight()) {
            System.out.println("Room " + room2.getRoomNumber() + " is more expensive than Room " + room1.getRoomNumber());
        } else {
            System.out.println("Room " + room1.getRoomNumber() + " and Room " + room2.getRoomNumber() + " have the same price.");
        }

        // Compare guests by age
        System.out.println("\n=== Compare guest ages ===");
        if (guest1.getAge() > guest2.getAge()) {
            System.out.println(guest1.getName() + " is older than " + guest2.getName());
        } else if (guest1.getAge() < guest2.getAge()) {
            System.out.println(guest2.getName() + " is older than " + guest1.getName());
        } else {
            System.out.println(guest1.getName() + " and " + guest2.getName() + " are the same age.");
        }

        // Compare bookings by total price
        System.out.println("\n=== Compare booking total prices ===");
        if (booking1.getTotalPrice() > booking2.getTotalPrice()) {
            System.out.println("Booking 1 is more expensive than Booking 2.");
        } else if (booking1.getTotalPrice() < booking2.getTotalPrice()) {
            System.out.println("Booking 2 is more expensive than Booking 1.");
        } else {
            System.out.println("Booking 1 and Booking 2 have the same total price.");
        }
    }
}

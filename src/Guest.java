public class Guest {
    private String name;
    private int age;
    private String phoneNumber;

    // Constructor
    public Guest(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to display guest info
    public void displayInfo() {
        System.out.println("Guest: " + name +
                " | Age: " + age +
                " | Phone: " + phoneNumber);
    }
}

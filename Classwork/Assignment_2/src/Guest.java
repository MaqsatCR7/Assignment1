public class Guest extends Parent {

    private String name;
    private int age;
    private String phoneNumber;

    public Guest(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Guest: " + name + ", age=" + age + ", phone=" + phoneNumber);
    }
}

public class Circle {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }


    public String toString() {
        return "Circle with radius: " + radius;
    }
}

public class Cylinder {
    private int radius;
    private int height;
    public Cylinder(int radius,int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double surfaceArea() {
        return 2*getRadius() * getRadius();
    }

    public double volume() {
        return surfaceArea() * getHeight();
    }

    public void display(){
        System.out.println("Cylinder area: " + surfaceArea());
        System.out.println("volume: " + volume());
    }
}

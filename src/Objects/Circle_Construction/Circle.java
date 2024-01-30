package Objects.Circle_Construction;

public class Circle {
    // Variables
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public Circle(Point center) {
        this.center = center;
        this.radius = 1;
    }
    public Circle(double radius) {
        this.center = new Point();
        this.radius = radius;
    }
    public Circle() {
        this.center = new Point();
        this.radius = 1;
    }

    // Accessors and Mutators
    Point getCenter() {
        return center;
    }
    double getRadius() {
        return radius;
    }
    void setCenter(Point c) {
        this.center = c;
    }
    void setRadius(double r) {
        this.radius = r;
    }
    
    //Methods
    public double calculateDiameter() {
        return radius * 2;
    }
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public String createEquation() {
        return "(x - " + center.getX() + ")^2 + (y - " + center.getY() + ")^2 = " + Math.pow(radius, 2);
    }
}

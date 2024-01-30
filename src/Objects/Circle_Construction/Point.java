package Objects.Circle_Construction;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x; 
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    void setX(double x) {
        this.x = x;
    }
    void setY(double y) {
        this.y = y;
    }
    void returnToOrigin() {
        x = 0;
        y = 0;
    }
}

public class Circle {
    private Point o;
    private double radius;

    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Point o, double radius) {
        this.o = o;
        this.radius = radius;
    }
    public Circle() {
        Point o1=new Point(0,0);
        this.o = o1;
        this.radius = 0;
    }
}

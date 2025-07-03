public class Circle {
    private double radius;
    public Circle() {
        radius = 1.0;
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

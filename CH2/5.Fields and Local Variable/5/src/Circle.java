public class Circle {
    private double radius;
    private int i; //i's scope is the hole Circle.java

    //Constructor methods have "method overloading"
    public Circle() {
        radius = 1.0;
    }

    public Circle(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void setI() {
      i = 100;
    }

    public void accessI() {
        System.out.println(i);
    }
}

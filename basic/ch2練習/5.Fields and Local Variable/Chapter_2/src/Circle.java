public class Circle {
    //Circle Class's consructor
    private double radius;
    private int i; //i's scopee is the whole Circle.java

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
        int i = 100;
        //i's scope is inside the method setI()
    }

    public void accessI() {
        System.out.println(i);
    }
}

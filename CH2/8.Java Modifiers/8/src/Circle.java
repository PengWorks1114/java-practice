public class Circle {
    //fields are usually private
    public double radius;

    public Circle(double radius) {

    }

    public double getArea() {
        this.printFormula();
        return this.radius * this.radius;
    }

    // methods are usually public
    public double setRadius(double radius) {
        this.radius = radius;
        return radius;
    }

    private void printFormula() {
        System.out.println("Circle area formula is pi * r square");
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        System.out.println(c1.radius);
        c1.radius = 20;
        System.out.println(c1.radius);
//如果在Circle.class裡面最上面把public改為Private這邊就不能去拿到他的數值
    }
}
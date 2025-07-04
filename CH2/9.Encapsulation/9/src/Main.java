//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Robot r = new Robot("Buzz", 1995);
    r.yearMade = -500;
    //隨時可以改它裡面的數值 因為我在Robot class裡面給他設定為public
    //為了不讓這件事情發生 我們要去更改Robot class裡面改為private
        System.out.println(r.name);
        System.out.println(r.yearMade);
    }
}
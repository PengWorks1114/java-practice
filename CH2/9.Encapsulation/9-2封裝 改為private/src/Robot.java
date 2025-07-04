public class Robot {
    private String name;
    private int yearMade;

    public Robot(String naem, int yearMade) {
        this.name = naem;
        this.yearMade = yearMade;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    //getter method
    public String getName() {
        return this.name;
    }

}

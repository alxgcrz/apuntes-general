package patterns.structural.facade.example2;

class RobotColor {

    private String color;

    void setColor(String color) {
        this.color = color;
        System.out.println("Color is set to : " + this.color);
    }

}

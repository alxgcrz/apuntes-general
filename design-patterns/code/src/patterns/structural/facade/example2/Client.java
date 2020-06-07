package patterns.structural.facade.example2;

class Client {

    public static void main(String[] args) {
        RobotFacade rf1 = new RobotFacade();
        rf1.robotBuilder("Green", "Iron");
        RobotFacade rf2 = new RobotFacade();
        rf2.robotBuilder("Blue", "Steel");
    }

}

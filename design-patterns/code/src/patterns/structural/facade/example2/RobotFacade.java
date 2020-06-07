package patterns.structural.facade.example2;

class RobotFacade {

    private RobotColor rc;
    private RobotMetal rm;
    private RobotBody rb;

    RobotFacade() {
        rc = new RobotColor();
        rm = new RobotMetal();
        rb = new RobotBody();
    }

    void robotBuilder(String color, String metal) {
        System.out.println("\nCreation of the Robot Start");
        rc.setColor(color);
        rm.setMetal(metal);
        rb.createBody();
        System.out.println("Robot Creation End");
        System.out.println();
    }

}

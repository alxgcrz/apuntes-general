package patterns.structural.facade.example2;

class RobotMetal {

    private String metal;

    void setMetal(String metal) {
        this.metal = metal;
        System.out.println("Metal is set to : " + this.metal);
    }

}

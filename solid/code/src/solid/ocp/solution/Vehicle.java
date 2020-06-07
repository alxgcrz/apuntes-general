package solid.ocp.solution;

class Vehicle {
    private int power;
    private int suspensionHeight;

    public int getPower() {
        return power;
    }

    public void setPower(final int power) {
        this.power = power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setSuspensionHeight(final int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }
}

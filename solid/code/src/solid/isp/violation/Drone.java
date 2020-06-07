package solid.isp.violation;

class Drone implements Switches {
    private boolean cameraOn;

    @Override
    public void startEngine() {
        // ...
    }


    @Override
    public void turnCameraOn() {
        cameraOn = true;
    }


    @Override
    public void turnCameraOff() {
        cameraOn = false;
    }


    @Override
    public void turnRadioOn() {
        // nothing to do here
    }


    @Override
    public void turnRadioOff() {
        // nothing to do here
    }
}

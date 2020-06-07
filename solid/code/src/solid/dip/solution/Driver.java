package solid.dip.solution;

class Driver {
    private Car racingCar;

    public Driver(final Car racingCar) {
        this.racingCar = racingCar;
    }

    public void increaseSpeed() {
        this.racingCar.accelerate();
    }
}

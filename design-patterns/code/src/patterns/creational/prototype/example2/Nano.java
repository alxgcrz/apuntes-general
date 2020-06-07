package patterns.creational.prototype.example2;

public class Nano extends BasicCar {

    Nano(String m) {
        modelname = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

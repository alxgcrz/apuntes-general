package patterns.creational.prototype.example2;

public class Ford extends BasicCar {

    Ford(String m) {
        modelname = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

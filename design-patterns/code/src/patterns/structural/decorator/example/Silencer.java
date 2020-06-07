package patterns.structural.decorator.example;

class Silencer extends FirearmDecorator {

    Silencer(Firearm gun) {
        super(gun);
    }

    @Override
    float noise() {
        return super.noise() - 55;
    }

    @Override
    int bullets() {
        return super.bullets();
    }

}

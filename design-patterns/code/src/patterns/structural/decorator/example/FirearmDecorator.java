package patterns.structural.decorator.example;

class FirearmDecorator extends Firearm {

    private Firearm gun;

    FirearmDecorator(Firearm gun) {
        this.gun = gun;
    }

    @Override
    float noise() {
        return gun.noise();
    }

    @Override
    int bullets() {
        return gun.bullets();
    }

}

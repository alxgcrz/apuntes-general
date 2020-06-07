package patterns.structural.decorator.example;

class Rifle extends Firearm {

    @Override
    float noise() {
        return super.noise();
    }

    @Override
    int bullets() {
        return super.bullets();
    }

}

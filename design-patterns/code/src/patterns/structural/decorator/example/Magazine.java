package patterns.structural.decorator.example;

class Magazine extends FirearmDecorator {

    Magazine(Firearm gun) {
        super(gun);
    }

    @Override
    float noise() {
        return super.noise();
    }

    @Override
    int bullets() {
        return super.bullets() + 5;
    }

}

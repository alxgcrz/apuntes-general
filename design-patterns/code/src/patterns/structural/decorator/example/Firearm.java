package patterns.structural.decorator.example;

class Firearm {

    private static final int MAX_BULLETS = 5;
    private static final float GENERIC_NOISE = 150.0f;

    float noise() {
        return GENERIC_NOISE;
    }

    int bullets() {
        return MAX_BULLETS;
    }

    @Override
    public String toString() {
        return "{Noise: " + noise() + " - Bullets: " + bullets() + "}";
    }

}

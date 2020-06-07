package patterns.creational.abstractfactory.example;

class Rider extends Soldier {

    Rider(String name, int life) {
        this.name = name;
        this.life = life;
    }

    @Override
    public int shotsPerSecond() {
        return 5;
    }

}

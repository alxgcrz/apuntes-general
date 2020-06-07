package patterns.creational.abstractfactory.example;

class Archer extends Soldier {

    Archer(String name, int life) {
        this.name = name;
        this.life = life;
    }

    @Override
    public int shotsPerSecond() {
        return 2;
    }

}

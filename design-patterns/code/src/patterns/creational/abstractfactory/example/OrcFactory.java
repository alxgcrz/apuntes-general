package patterns.creational.abstractfactory.example;

class OrcFactory implements SoldierFactory {

    @Override
    public Archer makeArcher() {
        return new Archer("Orc Archer", 200);
    }

    @Override
    public Rider makeRider() {
        return new Rider("Orc Rider", 250);
    }

}

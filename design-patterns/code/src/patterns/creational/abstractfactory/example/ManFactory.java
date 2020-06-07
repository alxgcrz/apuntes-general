package patterns.creational.abstractfactory.example;

class ManFactory implements SoldierFactory {

    @Override
    public Archer makeArcher() {
        return new Archer("Man Archer", 100);
    }

    @Override
    public Rider makeRider() {
        return new Rider("Man Rider", 150);
    }

}

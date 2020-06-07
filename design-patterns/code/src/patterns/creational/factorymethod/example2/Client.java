package patterns.creational.factorymethod.example2;

class Client {

    public static void main(String[] args) throws Exception {
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal duckType = animalFactory.getAnimalType("Duck");
        duckType.speak();

        IAnimal tigerType = animalFactory.getAnimalType("Tiger");
        tigerType.speak();

        //There is no Lion type. So, an exception will be thrown
        IAnimal lionType = animalFactory.getAnimalType("Lion");
        lionType.speak();
    }

}

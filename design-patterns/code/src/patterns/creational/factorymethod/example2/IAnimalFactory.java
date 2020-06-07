package patterns.creational.factorymethod.example2;

abstract class IAnimalFactory {

    public abstract IAnimal getAnimalType(String type) throws Exception;

}

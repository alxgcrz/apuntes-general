package patterns.creational.factorymethod.example;

public class Client {

    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();

        productA.operacion();
        productB.operacion();
    }

}

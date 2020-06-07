package patterns.structural.bridge.example;

class ImplementorB implements Implementor {

    @Override
    public void operation() {
        System.out.println("Esta es una implementacion de B");
    }

}

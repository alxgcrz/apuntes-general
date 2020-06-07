package patterns.structural.bridge.example;

class ImplementorA implements Implementor {

    @Override
    public void operation() {
        System.out.println("Esta es la implementacion A");
    }

}

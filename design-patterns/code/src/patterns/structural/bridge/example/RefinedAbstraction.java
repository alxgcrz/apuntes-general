package patterns.structural.bridge.example;

class RefinedAbstraction implements Abstraction {

    private Implementor implementor;

    RefinedAbstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }

}

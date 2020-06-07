package patterns.behavioral.observer.example;

public class Client {

    public static void main(String[] args) {

        Observable observable = new Observable();

        ConcreteObserver concreteObserver = new ConcreteObserver("UA4844");
        ConcreteObserver concreteObserver2 = new ConcreteObserver("CG9840");
        ConcreteObserver concreteObserver3 = new ConcreteObserver("YR3089");

        observable.agregarObservador(concreteObserver);
        observable.agregarObservador(concreteObserver2);
        observable.agregarObservador(concreteObserver3);

        observable.notificarObservadores();

        observable.eliminarObservador(concreteObserver);

        observable.notificarObservadores();

    }
}

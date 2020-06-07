package patterns.behavioral.observer.example;

class ConcreteObserver implements Observador {

    private String code;

    ConcreteObserver(String code) {
        super();
        this.code = code;
    }

    public void update() {
        System.out.println("ConcreteObserver with code " + code + " is notified!!");
    }

}

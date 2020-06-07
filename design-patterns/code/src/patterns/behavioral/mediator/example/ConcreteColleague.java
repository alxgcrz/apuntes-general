package patterns.behavioral.mediator.example;

class ConcreteColleague extends Colleague {

    ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }

}

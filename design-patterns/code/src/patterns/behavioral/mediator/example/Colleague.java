package patterns.behavioral.mediator.example;

abstract class Colleague {

    private Mediator mediator;

    Colleague(Mediator m) {
        mediator = m;
    }

    //send a message via the mediator
    void send(String message) {
        mediator.send(message, this);
    }

    public abstract void receive(String message);

}

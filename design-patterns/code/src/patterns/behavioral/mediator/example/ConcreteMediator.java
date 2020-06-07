package patterns.behavioral.mediator.example;

import java.util.ArrayList;

class ConcreteMediator implements Mediator {

    private ArrayList<Colleague> colleagues;

    ConcreteMediator() {
        colleagues = new ArrayList<>();
    }

    void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            //don't tell ourselves
            if (colleague != originator) {
                colleague.receive(message);
            }
        }
    }

}

package patterns.behavioral.memento.example;

import java.util.ArrayList;
import java.util.List;

class Caretaker {

    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.createMemento());
        originator.set("State3");
        // We can request multiple mementos, and choose which one to roll back to.
        savedStates.add(originator.createMemento());
        originator.set("State4");

        originator.restore(savedStates.get(1));
    }

}

package patterns.structural.composite.example;

public class Client {

    public static void main(String[] args) {
        Clock analogClock = new Clock();
        Clock digitalClock = new Clock();

        Bag bag = new Bag();

        bag.addItem(digitalClock);
        bag.addItem(analogClock);

        bag.removeItem(digitalClock);
    }

}

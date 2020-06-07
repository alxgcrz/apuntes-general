package patterns.other.reactor.example;

class Client implements EventHandler {

    @Override
    public void handle(Event event) {
        event.getInfo();
    }

}

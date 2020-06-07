package patterns.behavioral.mediator.example;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague desktop = new ConcreteColleague(mediator);
        ConcreteColleague mobile = new ConcreteColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello World");
        mobile.send("Hello");
    }
}

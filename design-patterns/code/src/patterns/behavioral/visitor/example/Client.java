package patterns.behavioral.visitor.example;

public class Client {

    public static void main(String[] args) {
        // Visitantes
        ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();

        // Visitables
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        // Visitar elementos
        concreteVisitor1.visitElementA(elementA);
        concreteVisitor2.visitElementB(elementB);
    }

}

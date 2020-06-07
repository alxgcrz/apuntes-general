package patterns.behavioral.visitor.example;

class ConcreteVisitor1 implements Visitor {

    @Override
    public void visitElementA(Element element) {
        System.out.println("Visitando " + element.toString());
    }

    @Override
    public void visitElementB(Element element) {
        throw new UnsupportedOperationException();
    }

}

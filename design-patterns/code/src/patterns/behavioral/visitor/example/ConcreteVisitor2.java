package patterns.behavioral.visitor.example;

class ConcreteVisitor2 implements Visitor {

    @Override
    public void visitElementA(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void visitElementB(Element element) {
        System.out.println("Visitando " + element.toString());
    }

}

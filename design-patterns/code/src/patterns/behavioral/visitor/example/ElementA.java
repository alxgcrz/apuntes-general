package patterns.behavioral.visitor.example;

class ElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    @Override
    public String toString() {
        return ElementA.class.getSimpleName();
    }

}

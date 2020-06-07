package patterns.behavioral.visitor.example;

class ElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    @Override
    public String toString() {
        return "ElementB";
    }

}

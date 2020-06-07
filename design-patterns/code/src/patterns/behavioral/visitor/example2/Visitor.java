package patterns.behavioral.visitor.example2;

class Visitor implements IVisitor {

    @Override
    public void visit(MyClass myClassElement) {
        System.out.println("Visitor is trying to change the integer value");
        myClassElement.setMyInt(100);
        System.out.println("Exiting from Visitor - visit");
    }

}

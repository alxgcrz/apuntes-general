package patterns.behavioral.visitor.example2;

class MyClass implements IOriginalInterface {

    //Initial or default value
    private int myInt = 5;

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    @Override
    public void accept(IVisitor visitor) {
        System.out.println("Initial value of the integer: " + myInt);
        visitor.visit(this);
        System.out.println("\nValue of the integer now: " + myInt);
    }

}

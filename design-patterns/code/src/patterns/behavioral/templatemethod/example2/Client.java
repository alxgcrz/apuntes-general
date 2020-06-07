package patterns.behavioral.templatemethod.example2;

class Client {

    public static void main(String[] args) {
        BasicEngineering bs = new ComputerScience();
        System.out.println("Computer Sc papers:");
        bs.papers();
        System.out.println();
        bs = new Electronics();
        System.out.println("Electronics papers:");
        bs.papers();
    }

}

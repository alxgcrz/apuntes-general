package patterns.structural.proxy.example2;

class Proxy extends Subject {

    private ConcreteSubject cs;

    @Override
    void doSomeWork() {
        System.out.println("Proxy call happening now");
        //Lazy initialization
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }

}

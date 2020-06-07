package patterns.structural.proxy.example2;

class ConcreteSubject extends Subject {

    @Override
    void doSomeWork() {
        System.out.println(" I am from concrete subject");
    }

}

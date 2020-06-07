package patterns.behavioral.observer.example4;

class Observer2 implements IObserver {

    @Override
    public void update(String s, int i) {
        System.out.println("Observer2: observes ->myValue is changed in  " + s + " to :" + i);
    }

}

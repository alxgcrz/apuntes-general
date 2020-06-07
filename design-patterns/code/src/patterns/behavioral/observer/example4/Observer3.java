package patterns.behavioral.observer.example4;

class Observer3 implements IObserver {

    @Override
    public void update(String s, int i) {
        System.out.println("Observer3 is observing:myValue is changed in  " + s + " to :" + i);
    }

}

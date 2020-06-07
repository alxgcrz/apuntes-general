package patterns.behavioral.observer.example3;

interface ISubject {

    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyObservers(int i);

}

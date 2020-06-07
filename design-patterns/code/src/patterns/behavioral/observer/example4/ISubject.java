package patterns.behavioral.observer.example4;

interface ISubject {

    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyObservers(int i);

}

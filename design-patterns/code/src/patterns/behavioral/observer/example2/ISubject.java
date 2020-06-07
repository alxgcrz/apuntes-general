package patterns.behavioral.observer.example2;

interface ISubject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

}

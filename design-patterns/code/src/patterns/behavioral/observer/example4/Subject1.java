package patterns.behavioral.observer.example4;

import java.util.ArrayList;
import java.util.List;

class Subject1 implements ISubject {

    List<IObserver> observersList = new ArrayList<>();
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        //Notify observers
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver o) {
        observersList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers(int updatedValue) {
        for (IObserver iObserver : observersList) {
            iObserver.update(this.getClass().getSimpleName(),
                    updatedValue);
        }
    }

}

package patterns.behavioral.observer.example;

import java.util.ArrayList;

class Observable {

    private ArrayList<Observador> observadores;


    Observable() {
        observadores = new ArrayList<>();
    }


    void agregarObservador(Observador observador) {
        observadores.add(observador);
    }


    void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }


    void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.update();
        }
    }

}

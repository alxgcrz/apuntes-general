package patterns.behavioral.chain.example;

abstract class Manejador {

    Manejador sucesor;

    void setSucesor(Manejador sucesor) {
        this.sucesor = sucesor;
    }

    abstract void manejarPeticion(Peticion peticion);

}

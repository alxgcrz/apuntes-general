package patterns.behavioral.chain.example;

class Peticion {

    private int value;
    private String descripcion;

    Peticion(String descripcion, int value) {
        this.value = value;
        this.descripcion = descripcion;
    }

    int getValue() {
        return value;
    }

    String getDescripcion() {
        return descripcion;
    }

}

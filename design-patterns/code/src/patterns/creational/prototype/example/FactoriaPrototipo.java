package patterns.creational.prototype.example;

class FactoriaPrototipo {

    private Producto productoA;

    FactoriaPrototipo() {
        productoA = new ProductoA();
    }

    Producto create() {
        return productoA.copy();
    }

}

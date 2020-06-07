package patterns.creational.prototype.example;

class ProductoA implements Producto {

    private String name = "ProductoA";

    @Override
    public Producto copy() {
        return new ProductoA();
    }

    @Override
    public String toString() {
        return name;
    }

}

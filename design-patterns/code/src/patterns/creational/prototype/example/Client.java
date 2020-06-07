package patterns.creational.prototype.example;

public class Client {

    public static void main(String[] args) {
        FactoriaPrototipo factoriaPrototipo = new FactoriaPrototipo();
        Producto producto = factoriaPrototipo.create();
        System.out.println(producto.toString());
    }

}

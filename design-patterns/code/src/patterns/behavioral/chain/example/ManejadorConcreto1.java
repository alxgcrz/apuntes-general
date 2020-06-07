package patterns.behavioral.chain.example;

class ManejadorConcreto1 extends Manejador {

    @Override
    public void manejarPeticion(Peticion peticion) {
        if (peticion.getValue() < 0) {
            System.out.println("Los valores negativos son manejados por " + getClass().getSimpleName());
            System.out.println("Valores peticion : " + peticion.getDescripcion() + peticion.getValue());
        } else {
            sucesor.manejarPeticion(peticion);
        }
    }

}

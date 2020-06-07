package patterns.behavioral.chain.example;

class ManejadorConcreto2 extends Manejador {

    @Override
    public void manejarPeticion(Peticion peticion) {
        if (peticion.getValue() >= 0) {
            System.out.println("Los valores mayores que 0 son manejados por " + getClass().getSimpleName());
            System.out.println("Valores peticion : " + peticion.getDescripcion() + peticion.getValue());
        } else {
            sucesor.manejarPeticion(peticion);
        }
    }

}

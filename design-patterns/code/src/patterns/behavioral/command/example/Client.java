package patterns.behavioral.command.example;

public class Client {

    public static void main(String[] args) {
        // Receptor de la acción
        Character character = new Character();

        // Invocador
        Engine engine = new Engine();

        // Ejecutar los comandos (acciones) sobre el receptor
        engine.execute(new Jump(character));
        engine.execute(new Run(character));
        engine.execute(new Walk(character));
    }

}

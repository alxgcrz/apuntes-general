package patterns.behavioral.command.example;

// Invocador
class Engine {

    // Execute
    void execute(Command command) {
        command.execute();
    }

}

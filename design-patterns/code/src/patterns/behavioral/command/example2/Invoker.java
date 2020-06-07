package patterns.behavioral.command.example2;

// Un invocador sólo conoce la interfaz de comandos ('ICommand')
// Desconoce los comandos.
class Invoker {

    void execute(Command cmd) {
        cmd.action();
    }

}

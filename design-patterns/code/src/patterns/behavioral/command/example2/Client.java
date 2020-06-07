package patterns.behavioral.command.example2;

class Client {

    public static void main(String[] args) {
        Receiver intendedReceiver = new Receiver();

        Undo unCmd = new Undo(intendedReceiver);
        Redo reCmd = new Redo(intendedReceiver);

        /*Client holds Invoker and Command Objects*/
        Invoker inv = new Invoker();
        inv.execute(unCmd);
        inv.execute(reCmd);
    }

}

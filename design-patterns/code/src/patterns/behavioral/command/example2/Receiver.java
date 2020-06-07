package patterns.behavioral.command.example2;

class Receiver {

    void performUndo() {
        System.out.println("Executing - Undo");
    }

    void performRedo() {
        System.out.println("Executing - Redo");
    }

}

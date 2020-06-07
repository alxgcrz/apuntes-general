package patterns.behavioral.command.example;

class Walk implements Command {

    // Receptor de la acción
    private Character character;

    Walk(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.walk();
    }

}

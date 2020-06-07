package patterns.behavioral.command.example;

// Receptor de la acción
class Character {

    void walk() {
        System.out.println("Executing 'walk()' in receiver (character");
    }

    void run() {
        System.out.println("Executing 'run()' in receiver (character)");
    }

    void jump() {
        System.out.println("Executing 'jump()' in receiver (character)");
    }

}

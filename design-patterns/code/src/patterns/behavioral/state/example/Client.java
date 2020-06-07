package patterns.behavioral.state.example;

public class Client {

    public static void main(String[] args) {

        Character character = new Character();
        System.out.println(character.getState().toString());

        character.walk();
        System.out.println(character.getState().toString());

        character.jump();
        System.out.println(character.getState().toString());

        character.getUp();
        System.out.println(character.getState().toString());
    }

}

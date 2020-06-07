package patterns.behavioral.state.example;

class CharacterLying implements CharacterState {

    private Character character;

    CharacterLying(Character character) {
        this.character = character;
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getUp() {
        System.out.println("Transición: Tumbado -> De pie");

        character.setState(new CharacterStanding(character));
    }

    @Override
    public void getDown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void jump() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return CharacterLying.class.getSimpleName();
    }

}

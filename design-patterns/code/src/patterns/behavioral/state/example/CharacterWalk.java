package patterns.behavioral.state.example;

class CharacterWalk implements CharacterState {

    private Character character;

    CharacterWalk(Character character) {
        this.character = character;
    }

    @Override
    public void getUp() {
        System.out.println("Transición: Andando -> Quieto");
        character.setState(new CharacterStanding(character));
    }

    @Override
    public void jump() {
        System.out.println("Transición: Andando -> Saltando");
        character.setState(new CharacterJump(character));
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getDown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return CharacterWalk.class.getSimpleName();
    }

}

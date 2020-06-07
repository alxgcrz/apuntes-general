package patterns.behavioral.strategy.example;

class GamePlayer {

    private Movement movement;

    void setMovement(Movement movement) {
        this.movement = movement;
    }

    void doBestMove() {
        movement.move();
    }

}

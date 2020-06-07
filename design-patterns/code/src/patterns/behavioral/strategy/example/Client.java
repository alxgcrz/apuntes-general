package patterns.behavioral.strategy.example;

public class Client {

    public static void main(String[] args) {

        GamePlayer player = new GamePlayer();

        Movement movement = new RandomMovement();
        player.setMovement(movement);

        player.doBestMove();
    }

}

package patterns.behavioral.templatemethod.example;

public class Client {

    public static void main(String[] args) {

        GamePlayer chessGame = new ChessPlayer();
        System.out.println("[CHESS]");

        chessGame.play();

        GamePlayer checkersPlayer = new CheckersPlayer();
        System.out.println("[CHECKERS]");

        checkersPlayer.play();
    }

}

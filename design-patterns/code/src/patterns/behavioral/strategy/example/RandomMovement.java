package patterns.behavioral.strategy.example;

class RandomMovement implements Movement {

    @Override
    public void move() {
        System.out.println("Random movement");
    }

}

package patterns.behavioral.strategy.example;

class IAMovement implements Movement {

    @Override
    public void move() {
        System.out.println("IA Movement");
    }

}

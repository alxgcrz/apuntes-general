package patterns.structural.flyweight.example3;

public class FlyweightPatternDemo {

    private static final String[] colors = {"Red", "Orange", "Blue", "Yellow", "Pink"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            AngryBird angrybird = (AngryBird) BirdFactory.getAngryBird(getRandomColor());

            angrybird.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

}

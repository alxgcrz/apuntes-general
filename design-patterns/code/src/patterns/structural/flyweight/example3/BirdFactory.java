package patterns.structural.flyweight.example3;

import java.util.HashMap;

class BirdFactory {

    private static final HashMap<String, Bird> angrybirdMap = new HashMap<>();

    static Bird getAngryBird(String color) {
        AngryBird angrybird = (AngryBird) angrybirdMap.get(color);

        if (angrybird == null) {
            angrybird = new AngryBird(color);
            angrybirdMap.put(color, angrybird);
            System.out.println("Creating Angry Bird of color : " + color);
        }
        return angrybird;
    }

}

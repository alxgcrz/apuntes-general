package patterns.structural.flyweight.example3;

class AngryBird implements Bird {

    private String color;

    AngryBird(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Angry Bird: Draw() [Color : " + color + "]");
    }

}

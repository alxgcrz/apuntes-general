package patterns.structural.proxy.example;

class Image extends Graphic {

    @Override
    String display() {
        return "Display image";
    }

    void load() {
        // ...
    }

}

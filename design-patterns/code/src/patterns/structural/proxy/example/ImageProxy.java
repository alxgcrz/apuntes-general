package patterns.structural.proxy.example;

class ImageProxy extends Graphic {

    private Image image;

    @Override
    String display() {
        if (image == null) {
            image = new Image();
            image.load();
        }
        return image.display();
    }

}

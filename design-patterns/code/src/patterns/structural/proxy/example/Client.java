package patterns.structural.proxy.example;

public class Client {

    public static void main(String[] args) {
        Graphic image = new ImageProxy();

        System.out.println(image.display());
        System.out.println(image.display());
        System.out.println(image.display());
    }

}

package patterns.creational.singleton.example2;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {}

    private static synchronized void createInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

}

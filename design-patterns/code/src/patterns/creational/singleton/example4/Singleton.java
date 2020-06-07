package patterns.creational.singleton.example4;

public class Singleton {

    private Singleton() {}

    private static class SingletonHelper {

        //Nested class is referenced after getCaptain() is called
        private static final Singleton SINGLETON = new Singleton();

    }

    public static Singleton getINSTANCE() {
        return SingletonHelper.SINGLETON;
    }

}

package web;

import web.classes.Singleton;

public class CallSingletonInstance {

    public static void main(String args[]) {
        Singleton.INSTANCE.printSomething();
        Singleton.printSomethingJava();
    }

}

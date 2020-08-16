package web;

import web.utils.UserUtils;
import web.utils.UtilsKt;

public class JavaCall {

    // Given that Java doesn't support top-level functions, the Kotlin compiler behind the scenes
    // will create a Java class, and the individual top-level functions will be converted to static methods.
    // This means that Java callers can simply call the method by referencing its generated class,
    // just like for any other static method.
    public static void main(String args[]) {
        System.out.println("User status: " + UtilsKt.checkUserStatus() + " [JAVA]");
        System.out.println("User status: " + UserUtils.checkStatus() + " [JAVA]");
    }

}

package web;

import web.utils.StringUtilsKt;

public class CallExtensionFunctionFromJava {

    // Call an extension function from Java
    public static void main(String args[]) {
        String name = "john";
        System.out.println("My name is " + StringUtilsKt.upperCaseFirstLetter(name));
    }
}

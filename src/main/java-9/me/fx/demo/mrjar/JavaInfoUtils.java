package me.fx.demo.mrjar;

public final class JavaInfoUtils {
    public static String version() {
        System.out.println("execute in [java-9] JDK Env");
        return Runtime.version().toString();
    }

    private JavaInfoUtils() {};
}

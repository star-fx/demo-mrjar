package me.fx.demo.mrjar;

public final class JavaInfoUtils {
    public static String version() {
        System.out.println("execute in [pre-java-9] JDK Env");
        return System.getProperty("java.version");
    }

    private JavaInfoUtils() {};
}

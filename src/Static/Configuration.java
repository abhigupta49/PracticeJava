package Static;

public class Configuration {
    public static String configValue;

    static {
        configValue = "Default";
        System.out.println("Static block executed :config value assigned");
    }
}

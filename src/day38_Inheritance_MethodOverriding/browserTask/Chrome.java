package day38_Inheritance_MethodOverriding.browserTask;

public class Chrome extends Browser {
    public Chrome() {
        super("chrome");
    }

    @Override
    public void openBrowser() {
        System.out.println("opening " + name + " browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing " + name + " browser");
    }
}

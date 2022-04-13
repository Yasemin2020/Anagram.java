package day38_Inheritance_MethodOverriding.BrowserTask;

public class Safari extends Browser {
    public Safari(String name) {
        super("safari");
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

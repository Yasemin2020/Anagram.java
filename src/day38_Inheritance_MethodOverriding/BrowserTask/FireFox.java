package day38_Inheritance_MethodOverriding.BrowserTask;

public class FireFox extends Browser{
    public FireFox() {
        super("firefox");
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

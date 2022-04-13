package day38_Inheritance_MethodOverriding.browserTask;

public class Opera extends Browser {

    public Opera() {
        super("opera");
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

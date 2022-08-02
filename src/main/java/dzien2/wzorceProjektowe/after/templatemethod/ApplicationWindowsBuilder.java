package dzien2.wzorceProjektowe.after.templatemethod;

public class ApplicationWindowsBuilder extends ApplicationBuilder{
    @Override
    public void installIDE() {
        System.out.println("Double clicked on a shortcut");
    }

    @Override
    public void runIDE() {
        System.out.println("Ide is Running on Windows");

    }
}

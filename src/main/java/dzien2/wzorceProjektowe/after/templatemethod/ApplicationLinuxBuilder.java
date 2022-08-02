package dzien2.wzorceProjektowe.after.templatemethod;

public class ApplicationLinuxBuilder extends ApplicationBuilder{
    @Override
    public void installIDE() {
        System.out.println("apt get");
    }

    @Override
    public void runIDE() {
        System.out.println("IDE is running on Linux");

    }
}

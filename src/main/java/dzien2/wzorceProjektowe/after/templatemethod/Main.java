package dzien2.wzorceProjektowe.after.templatemethod;

public class Main {

    public static void main(String[] args) {
        ApplicationBuilder appWindows = new ApplicationWindowsBuilder();
        ApplicationBuilder appLinux = new ApplicationLinuxBuilder();
        appWindows.writeApp();
        appLinux.writeApp();
    }
}

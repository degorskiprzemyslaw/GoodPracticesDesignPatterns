package dzien2.wzorceProjektowe.after.templatemethod.slide66Task;

public class RichComputer extends Computer {
    @Override
    public void installProcessor() {
        System.out.println("Golden processor Intel 7 is installed");
    }

    @Override
    public void installGraphicCard() {
        System.out.println("Platinum graphicCard is installed");

    }

    @Override
    public void addMonitor() {
        System.out.println("Monitor with Retina screen is added");

    }
}

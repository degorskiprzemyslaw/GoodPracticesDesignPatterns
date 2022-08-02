package dzien2.wzorceProjektowe.after.templatemethod.slide66Task;

public class EconomicComputer extends Computer {
    @Override
    public void installProcessor() {
        System.out.println("Processor Intel 5 is installed");
    }

    @Override
    public void installGraphicCard() {
        System.out.println("Common graphicCard is installed");

    }

    @Override
    public void addMonitor() {
        System.out.println("Monitor with common screen is added");

    }
}

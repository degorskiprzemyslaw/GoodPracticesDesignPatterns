package dzien2.wzorceProjektowe.after.templatemethod.slide66Task;

public abstract class Computer {

    public void createComputer() {
        prepareMotherboard();
        installProcessor();
        installGraphicCard();
        addKeyboard();
        addMouse();
        addMonitor();

    }


    private void prepareMotherboard() {
        System.out.println("Motherboard is set");
    }

    public abstract void installProcessor();

    public abstract void installGraphicCard();

    private void addKeyboard() {
        System.out.println("Keyboard is added");
    }

    private void addMouse() {
        System.out.println("Mouse is added");
    }

    public abstract void addMonitor();

}

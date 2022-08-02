package dzien2.wzorceProjektowe.after.templatemethod;

public abstract class ApplicationBuilder {

    public void writeApp(){
        openSystem();
        installIDE();
        runIDE();
    }

    private void openSystem(){
        System.out.println("Power button is pressed");
    }

    public abstract void installIDE();

    public abstract void runIDE();
}

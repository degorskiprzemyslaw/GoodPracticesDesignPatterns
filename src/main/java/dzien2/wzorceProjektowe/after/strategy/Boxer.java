package dzien2.wzorceProjektowe.after.strategy;

public class Boxer {
    private Punch punch;
    private String name;

    public Boxer(String name) {
        this.name = name;
    }

    public void setPunch(Punch punch) {
        this.punch = punch;
    }

    public void hitOtherBoxer(){
        punch.hit();
    }
}

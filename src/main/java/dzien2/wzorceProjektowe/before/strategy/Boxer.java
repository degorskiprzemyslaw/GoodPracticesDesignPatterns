package dzien2.wzorceProjektowe.before.strategy;

public class Boxer {
    private String name;

    public Boxer(String name) {
        this.name = name;
    }

    public void leftPunch(){
        System.out.println("Hitting with left punch");
    }
    public void rightPunch(){
        System.out.println("Hitting with right punch");
    }

    public void headPunch(){

    }

    public String getName() {
        return name;
    }
}

package dzien2.wzorceProjektowe.after.strategy;

public class Main {

    public static void main(String[] args) {

        Boxer boxer = new Boxer("Rocky");
        boxer.setPunch(new LeftPunch());
        boxer.hitOtherBoxer();

    }
}

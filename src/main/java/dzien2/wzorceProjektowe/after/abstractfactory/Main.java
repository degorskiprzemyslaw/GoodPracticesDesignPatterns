package dzien2.wzorceProjektowe.after.abstractfactory;

import dzien2.wzorceProjektowe.after.abstractfactory.units.*;

public class Main {
    public static void main(String[] args) {
        UnitFactory redArmyFactory = new RedArmyFactory();
        UnitFactory blueArmyFactory = new BlueArmyFactory();

        Android blueAndroid = blueArmyFactory.createAndroid(8000);
        Alien blueAlien = blueArmyFactory.createAlien("soldier");

        Android redAndroid = redArmyFactory.createAndroid(8000);
        Alien redAlien = redArmyFactory.createAlien("soldier");
        System.out.println(blueAndroid);
        System.out.println(blueAlien);
        System.out.println(redAndroid);
        System.out.println(redAlien);
    }
}

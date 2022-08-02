package dzien2.wzorceProjektowe.after.factorymethod;

import dzien2.wzorceProjektowe.after.factorymethod.units.Alien;
import dzien2.wzorceProjektowe.after.factorymethod.units.SectoidFactory;
import dzien2.wzorceProjektowe.after.factorymethod.units.UnitFactory;

public class Main {
    public static void main(String[] args) {
        UnitFactory sectoidFactory = new SectoidFactory();
        UnitFactory mutonFactory = new SectoidFactory();
        Alien sectoid = sectoidFactory.create("leader");
        Alien muton = mutonFactory.create("soldier");
        System.out.println(sectoid);
        System.out.println(muton);
    }
}

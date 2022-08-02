package dzien2.wzorceProjektowe.after.factorymethod;

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

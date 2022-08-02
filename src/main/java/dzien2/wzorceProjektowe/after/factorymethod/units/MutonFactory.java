package dzien2.wzorceProjektowe.after.factorymethod.units;

public class MutonFactory extends UnitFactory {

    @Override
    public Muton create(String alienType) {
        switch (alienType) {
            case "leader":
                return new Muton("leader", 150);
            case "soldier":
                return new Muton("soldier", 75);
            default:
                return new Muton("default", 90);

        }
    }
}

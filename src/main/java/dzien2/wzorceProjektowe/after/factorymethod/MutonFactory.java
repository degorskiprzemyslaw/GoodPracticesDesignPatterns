package dzien2.wzorceProjektowe.after.factorymethod;

public class MutonFactory extends UnitFactory {

    @Override
    public Sectoid create(String alienType) {
        switch (alienType) {
            case "leader":
                return new Sectoid("leader", 150);
            case "soldier":
                return new Sectoid("soldier", 75);
            default:
                return new Sectoid("default", 90);

        }
    }
}

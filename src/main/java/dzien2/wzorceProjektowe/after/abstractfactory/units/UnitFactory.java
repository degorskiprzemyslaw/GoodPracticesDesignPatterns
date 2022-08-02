package dzien2.wzorceProjektowe.after.abstractfactory.units;

public abstract class UnitFactory {

    public abstract Alien createAlien(String type);
    public abstract Android createAndroid(int version);
}

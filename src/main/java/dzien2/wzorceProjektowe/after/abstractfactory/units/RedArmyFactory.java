package dzien2.wzorceProjektowe.after.abstractfactory.units;

public class RedArmyFactory extends UnitFactory{
    @Override
    public Alien createAlien(String type) {
        switch (type){
            case "leader" :
                return new Sectoid("leader", 300);
            case "soldier" :
                return new Muton("soldier", 100);
            default :
                return new Sectoid("soldier", 250);
        }
    }

    @Override
    public Android createAndroid(int version) {
        switch(version) {
            case 1000:
                return new Terminator(1000, 800);
            case 8000:
                return new Terminator(8000, 1500);
            default:
                return new Terminator(5000, 1250);
        }

    }
}

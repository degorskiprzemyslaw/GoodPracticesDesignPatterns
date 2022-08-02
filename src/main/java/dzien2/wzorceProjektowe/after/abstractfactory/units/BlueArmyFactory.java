package dzien2.wzorceProjektowe.after.abstractfactory.units;

public class BlueArmyFactory extends UnitFactory{

    @Override
    public Alien createAlien(String type) {
        switch (type){
            case "leader" :
                return new Sectoid("leader", 400);
            case "soldier" :
                return new Muton("soldier", 50);
            default :
                return new Sectoid("soldier", 150);
        }
    }

    @Override
    public Android createAndroid(int version) {
        switch(version) {
            case 1000:
                return new Terminator(1000, 1200);
            case 8000:
                return new Terminator(8000, 1300);
            default:
                return new Terminator(5000, 800);
        }

    }
}

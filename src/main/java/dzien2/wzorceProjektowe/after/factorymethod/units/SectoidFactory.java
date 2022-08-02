package dzien2.wzorceProjektowe.after.factorymethod.units;

public class SectoidFactory extends UnitFactory{
    @Override
    public Sectoid create(String alienType) {
        switch(alienType){
            case "leader" :
                return new Sectoid("leader", 300);
            case "soldier" :
                return new Sectoid("soldier", 200);
            default :
                return new Sectoid("default", 225);

        }


    }
}

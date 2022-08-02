package dzien2.wzorceProjektowe.after.abstractfactory.units;

public abstract class Android {
    private int version;
    private int stamina;

    @Override
    public String toString() {
        return "Android{" +
                "version=" + version +
                ", stamina=" + stamina +
                '}';
    }

    protected Android(int version, int stamina) {
        this.version = version;
        this.stamina = stamina;
    }
}

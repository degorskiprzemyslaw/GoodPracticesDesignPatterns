package dzien2.wzorceProjektowe.after.factorymethod.units;

public abstract class Alien {
    private String rank;
    private int stamina;

    protected Alien(String rank, int stamina) {
        this.rank = rank;
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "rank='" + rank + '\'' +
                ", stamina=" + stamina +
                '}';
    }
}

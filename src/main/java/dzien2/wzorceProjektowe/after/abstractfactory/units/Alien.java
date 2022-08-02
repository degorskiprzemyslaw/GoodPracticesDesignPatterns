package dzien2.wzorceProjektowe.after.abstractfactory.units;

public abstract class Alien {
    private String rank;
    private int stamina;

    @Override
    public String toString() {
        return "Alien{" +
                "rank='" + rank + '\'' +
                ", stamina=" + stamina +
                '}';
    }

    public Alien(String rank, int stamina) {
        this.rank = rank;
        this.stamina = stamina;
    }
}

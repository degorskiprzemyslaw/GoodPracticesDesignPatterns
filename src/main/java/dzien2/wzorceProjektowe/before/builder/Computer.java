package dzien2.wzorceProjektowe.before.builder;

public class Computer {
    private String processor;
    private String ram;
    private String graphic;

    private String mainboard;

    public Computer(String processor, String ram, String graphic, String mainboard) {
        this.processor = processor;
        this.ram = ram;
        this.graphic = graphic;
        this.mainboard = mainboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphic='" + graphic + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}

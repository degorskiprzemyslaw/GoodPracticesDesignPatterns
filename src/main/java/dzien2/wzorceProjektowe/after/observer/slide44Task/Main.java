package dzien2.wzorceProjektowe.after.observer.slide44Task;


import dzien2.wzorceProjektowe.after.observer.Status;

public class Main {
    public static void main(String[] args) {
        Day day = new Day("Thursday", WeatherStatus.SNOWY);

        TvNotification tv = new TvNotification();
        RadioNotification radio = new RadioNotification();
        day.addMedium(tv);
        day.addMedium(radio);
        day.update(WeatherStatus.RAINY);

    }
}

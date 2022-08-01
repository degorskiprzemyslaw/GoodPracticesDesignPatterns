package dzien2.wzorceProjektowe.after.observer.slide44Task;

public class TvNotification implements Medium{

    @Override
    public void update(Day day) {
        System.out.println("Radio news: ");
        System.out.println(day.getDayOfTheWeek() + " will be " + day.getWeatherStatus());
    }
}

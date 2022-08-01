package dzien2.wzorceProjektowe.after.observer.slide44Task;

import dzien2.wzorceProjektowe.after.observer.Status;

import java.util.ArrayList;
import java.util.List;

public class Day implements Observable{
    private String dayOfTheWeek;
    private WeatherStatus weatherStatus;
    List<Medium> media = new ArrayList<>();

    public Day(String dayOfTheWeek, WeatherStatus weatherStatus) {
        this.dayOfTheWeek = dayOfTheWeek;
        this.weatherStatus = weatherStatus;
    }

    @Override
    public void addMedium(Medium medium) {
        media.add(medium);
    }

    @Override
    public void removerMedium(Medium medium) {
        media.remove(medium);

    }

    public WeatherStatus getWeatherStatus() {
        return weatherStatus;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    @Override
    public void notifyAllMedia() {
        for (Medium medium : media) {
            medium.update(this);

        }

    }

    public void update(WeatherStatus weatherStatus) {
        this.weatherStatus = weatherStatus;
        notifyAllMedia();
    }
}

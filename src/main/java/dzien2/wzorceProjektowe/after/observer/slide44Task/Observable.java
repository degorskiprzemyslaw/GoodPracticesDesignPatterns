package dzien2.wzorceProjektowe.after.observer.slide44Task;



public interface Observable {
    void addMedium(Medium medium);
    void removerMedium(Medium medium);
    void notifyAllMedia();
}

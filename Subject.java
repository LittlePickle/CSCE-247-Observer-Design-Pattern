
/**
 * the cook from Breaking Bad
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String location, String description);
}

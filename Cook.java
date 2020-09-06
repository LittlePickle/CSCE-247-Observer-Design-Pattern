
import java.util.ArrayList;

public class Cook implements Subject {

    private ArrayList<Observer> observers;
    private String name;

    public Cook(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String location, String description) {
        for (Observer observer : observers) {
            observer.update(location, description);
        }
    }

    /**
     * When this method is called when the cook is seen. </br>
     * You will pass both the location of the sighting, </br>
     * and a description of the sighting.</br>
     *
     * @param location
     * @param description
     */
    public void enterSighting(String location, String description) {
        notifyObservers(location, description);
    }

    public String getName() {
        return this.name;
    }
}

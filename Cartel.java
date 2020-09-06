
import java.util.ArrayList;

public class Cartel implements Observer {

    private Subject cook;
    private ArrayList<Sighting> sightings;
    private String notes;

    public Cartel(Subject cook) {
        this.cook = cook;
        cook.registerObserver(this);
        sightings = new ArrayList<>();
    }

    // Keeps track of the locations as an ArrayList of Sightin
    @Override
    public void update(String location, String description) {
        sightings.add(new Sighting(location, description));
    }

    // Displays each location followed by the description in ().
    @Override
    public String getLog() {
        String log = "";
        for (Sighting sighting : sightings) {
            log += String.format("%s (%s)\n", sighting.getLocation(), sighting.getDetails());
        }
        return log;
    }
}

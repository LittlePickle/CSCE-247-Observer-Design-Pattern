
import java.util.ArrayList;

public class DEA implements Observer {

    private Subject cook;
    private ArrayList<String> locations;
    private String notes;

    public DEA(Subject cook) {
        this.cook = cook;
        cook.registerObserver(this);
        locations = new ArrayList<String>();
        notes = "";
    }

    // Keeps track of the locations as an ArrayList of Strings,
    // Keeps track of the descriptions in one string called notes.
    @Override
    public void update(String location, String description) {
        locations.add(location);
        notes += description + "\n";
    }

    // Displays the locations, followed by the notes.
    public String getLog() {
        String log = "";
        log += "Locations:\n";
        for (String loc : locations) {
            log += loc + "\n";
        }

        log += "\nNotes:\n" + notes;
        return log;
    }
}

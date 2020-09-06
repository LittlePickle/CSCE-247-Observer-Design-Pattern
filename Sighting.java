
/**
 * store the information
 */
public class Sighting {

    private String location;
    private String details;

    public Sighting(String location, String details) {
        this.location = location;
        this.details = details;
    }

    public String getLocation() {
        return location;
    }

    public String getDetails() {
        return details;
    }

}

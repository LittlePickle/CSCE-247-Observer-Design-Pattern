
/**
 * both keep track of the same information, just in slightly different formats.
 */
public interface Observer {

    void update(String location, String description);

    String getLog();
}

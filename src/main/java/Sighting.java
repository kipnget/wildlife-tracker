import java.sql.Timestamp;
import java.util.List;
import org.sql2o.*;

public class Sighting {
    private int id;
    private int animalId;
    private int locationId;
    private int rangerId;
    private Timestamp timeOfSighting;

    public Sighting (int animalId, int locationId, int rangerId, Timestamp timeOfSighting) {
        if(!Animal.idExists(animalId)) {
            throw new IllegalArgumentException("Error: invalid animalId");
        }
        this.animalId = animalId;
        if(!Location.idExists(locationId)) {
            throw new IllegalArgumentException("Error: invalid locationId");
        }
        this.locationId = locationId;
        if(!Ranger.idExists(rangerId)) {
            throw new IllegalArgumentException("Error: invalid locationId");
        }
        this.rangerId = rangerId;
        this.timeOfSighting = timeOfSighting;
    }

    public int getId() {
        return this.id;
    }

    public int getAnimalId() {
        return this.animalId;
    }
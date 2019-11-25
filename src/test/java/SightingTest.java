import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

import java.sql.Timestamp;

import static org.junit.Assert.assertTrue;

public class SightingTest {
    private RegularAnimal testAnimal;
    private Location testLocation;
    private Ranger testRanger;

    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Before
    public void setUp() {
        testAnimal = new RegularAnimal("Rabbit");
        testAnimal.save();
        testLocation = new Location("Near bridge", 1.525, -2.311);
        testLocation.save();
        testRanger = new Ranger("User", "Mjanja", "Mwenyewe", 1, 5035550000l);
        testRanger.save();
    }

    //Instantiation
    @Test
    public void sighting_instantiatesCorrectly_true() {
        Sighting testSighting = new Sighting(testAnimal.getId(), testLocation.getId(), testRanger.getId(), new Timestamp(1L));
        assertTrue(testSighting instanceof Sighting);
    }
}
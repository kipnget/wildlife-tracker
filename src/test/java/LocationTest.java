import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LocationTest {

    @Rule
    public DatabaseRule database = new DatabaseRule();

    // Instantiation
    @Test
    public void ranger_instantiatesCorrectly_true() {
        Location testLocation = new Location("Near bridge", 1.525, -2.311);
        assertTrue(testLocation instanceof Location);
    }

    @Test
    public void ranger_instantiatesWithoutId_0() {
        Location testLocation = new Location("Near bridge", 1.525, -2.311);
        assertEquals(0, testLocation.getId());
    }

    //Name
    @Test
    public void ranger_instantiatesWithName_User() {
        Location testLocation = new Location("Near bridge", 1.525, -2.311);
        assertEquals("Near bridge", testLocation.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void ranger_cannotInstantiateEmptyUserName_IllegalArgumentException() {
        Location testLocation = new Location("", 1.525, -2.311);
    }

    @Test
    public void setUserName_setsANewName_NewName() {
        Location testLocation = new Location("Near bridge", 1.525, -2.311);
        testLocation.setName("NewName");
        assertEquals("NewName", testLocation.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setUserName_cannotSetEmptyName_IllegalArgumentException() {
        Location testLocation = new Location("Near bridge", 1.525, -2.311);
        testLocation.setName("");
    }

    @Test
    public void save_savesNameToDB_Nearbridge() {
        Location testLocation = new Location("Near bridge", 1.525, -2.311);
        testLocation.save();
        Location savedLocation = Location.find(testLocation.getId());
        assertEquals("Near bridge", savedLocation.getName());
    }

    @Test
    public void update_preservesOriginalName_Nearbridge() {
        Location testLocation = new Location("Near bridge", 1.525, -2.311);
        testLocation.save();
        testLocation.update();
        Location savedLocation = Location.find(testLocation.getId());
        assertEquals("Near bridge", savedLocation.getName());
    }

    @Test
    public void update_savesNewNameToDB_NewLocation() {
        Location testLocation = new Location("Near bridge", 1.525, -2.311);
        testLocation.save();
        testLocation.setName("New Location");
        testLocation.update();
        Location savedLocation = Location.find(testLocation.getId());
        assertEquals("New Location", savedLocation.getName());
    }

}
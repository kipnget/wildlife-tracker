import org.junit.Rule;
import org.junit.Test;

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
}
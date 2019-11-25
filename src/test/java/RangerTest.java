import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RangerTest {

    @Rule
    public DatabaseRule database = new DatabaseRule();

    // Instantiation
    @Test
    public void ranger_instantiatesCorrectly_true() {
        Ranger testRanger = new Ranger("User", "Mjanja", "Mwenyewe", 1, 5035550000L);
        assertTrue(testRanger instanceof Ranger);
    }
}
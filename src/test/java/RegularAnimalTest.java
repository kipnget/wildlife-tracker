import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegularAnimalTest {

    @Rule
    public DatabaseRule database = new DatabaseRule();

    //Instantiation
    @Test
    public void animal_instantiatesCorrectly_true() {
        RegularAnimal testAnimal = new RegularAnimal("Rabbit");
        assertTrue(testAnimal instanceof RegularAnimal);
    }
}
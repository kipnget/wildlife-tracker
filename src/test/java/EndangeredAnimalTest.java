import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EndangeredAnimalTest {

    @Rule
    public DatabaseRule database = new DatabaseRule();

    //Instantiation
    @Test
    public void endangeredAnimal_instantiatesCorrectly_true() {
        EndangeredAnimal testAnimal = new EndangeredAnimal("Rhino", 1.5, "Good");
        assertTrue(testAnimal instanceof EndangeredAnimal);
    }
}
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void animal_instantiatesWithoutId_0() {
        RegularAnimal testAnimal = new RegularAnimal("Rabbit");
        assertEquals( 0, testAnimal.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void animal_cannotInstantiateEmptyName_IllegalArgumentException() {
        RegularAnimal testAnimal = new RegularAnimal("");
    }

    // Name
    @Test
    public void animal_instantiatesWithName_Rabbit() {
        RegularAnimal testAnimal = new RegularAnimal("Rabbit");
        assertEquals("Rabbit", testAnimal.getName());
    }

    @Test
    public void setName_setsANewName_Goat() {
        RegularAnimal testAnimal = new RegularAnimal("Rabbit");
        testAnimal.setName("Goat");
        assertEquals("Goat", testAnimal.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setName_cannotSetEmptyName_IllegalArgumentException() {
        RegularAnimal testAnimal = new RegularAnimal("Rabbit");
        testAnimal.setName("");
    }

    @Test
    public void save_savesNameToDB_Rabbit() {
        RegularAnimal testAnimal = new RegularAnimal("Rabbit");
        testAnimal.save();
        RegularAnimal savedRegularAnimal = RegularAnimal.find(testAnimal.getId());
        assertEquals("Rabbit", savedRegularAnimal.getName());
    }

    @Test
    public void update_preservesOriginalName_Rabbit() {
        RegularAnimal testAnimal = new RegularAnimal("Rabbit");
        testAnimal.save();
        testAnimal.update();
        RegularAnimal savedRegularAnimal = RegularAnimal.find(testAnimal.getId());
        assertEquals("Rabbit", savedRegularAnimal.getName());
    }

    @Test
    public void update_savesNewNameTODB_Goat() {
        RegularAnimal testAnimal = new RegularAnimal("Rabbit");
        testAnimal.save();
        testAnimal.setName("Goat");
        testAnimal.update();
        RegularAnimal savedRegularAnimal = RegularAnimal.find(testAnimal.getId());
        assertEquals("Goat", savedRegularAnimal.getName());
    }

}
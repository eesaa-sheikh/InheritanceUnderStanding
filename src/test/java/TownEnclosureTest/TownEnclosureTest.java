package TownEnclosureTest;
import AbstractBuilding.Mansion;
import AbstractBuilding.StudentFlat;
import Town.TownEnclosure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TownEnclosureTest {

    public TownEnclosure townEnclosure;

    @BeforeEach

    public void setup() {
        townEnclosure = new TownEnclosure("Nuneaton");
    }

    @Test
    public void canCountProperty() {
        int expected = 0;
        int actual = townEnclosure.countProperty();
        assertEquals(expected, actual);
    }

    @Test

    //Testing to see if both subClasses
    public void canAddPropertyMansionandStudentFlat() {
Mansion newMansion= new AbstractBuilding.Mansion("Shaquille O' Neals house",
        32,
        01.1796,
        true,
        12,
        29,
        100);
        //add a new studentFlat property
StudentFlat newStudentFlat= new AbstractBuilding.StudentFlat("Aston University",
        12,
        12.2009,
        10,
        10 ,
        false);
    // New Mansion
        Mansion belaAirMansion= new AbstractBuilding.Mansion("Uncle Phill's House",
                8,
                01.995,
                false,
                1,
                2,
                1);

        townEnclosure.addProperty(newMansion);
        townEnclosure.addProperty(newStudentFlat);
        townEnclosure.addProperty(belaAirMansion);
    int expected = 3;
    int actual = townEnclosure.countProperty();

    assertEquals(expected, actual);


}
}

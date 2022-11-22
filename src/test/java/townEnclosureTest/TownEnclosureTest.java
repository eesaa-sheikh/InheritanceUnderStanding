package townEnclosureTest;
import abstractBuilding.Mansion;
import abstractBuilding.StudentFlat;
import town.TownEnclosure;
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
Mansion newMansion= new abstractBuilding.Mansion("Shaquille O' Neals house",
        32_000_000,
        23,
        01.1796,
        true,
        29,
        100, 100);
        //add a new studentFlat property
StudentFlat newStudentFlat= new abstractBuilding.StudentFlat("Aston University",
        9_000,
        10,
        12.2009,
        1110 ,
        7, true);
    // New Mansion
        Mansion belaAirMansion= new abstractBuilding.Mansion("Uncle Phill's House",
                8_000_000,
                8,
                01.1995,
                false,
                2,
                1, 10);

        townEnclosure.addProperty(newMansion);
        townEnclosure.addProperty(newStudentFlat);
        townEnclosure.addProperty(belaAirMansion);
    int expected = 3;
    int actual = townEnclosure.countProperty();

    assertEquals(expected, actual);


}
}

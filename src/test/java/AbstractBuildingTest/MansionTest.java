package AbstractBuildingTest;
import AbstractBuilding.Mansion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MansionTest {

    private Mansion mansion;

    @BeforeEach


    public void setUp(){
        mansion = new Mansion("Valhalla", 82,
                01.1999,
                true,
                10, 100, 15);
    }

    @Test

    //Testing Name

    public void nameProperty(){
        // Arrange
        String expected = "Valhalla";
        // Acting
        String actual = mansion.getNameOfProperty();
        //Assert
        assertEquals(expected, actual);


        //   assertEquals(actual).isEqualTo(expected);
    }

    @Test

    //Testing Number Of Chef
    public void numberOfChef(){
        int expected = 15;

        int actual = mansion.getNumberOfChefs();

        assertEquals(expected,actual);
    }
    @Test
    public void numberOfCars(){
        int expected = 100;

        int actual = mansion.getNumberOfSportsCars();

        assertEquals(expected,actual);
    }

}

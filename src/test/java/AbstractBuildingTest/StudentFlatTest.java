package AbstractBuildingTest;
import AbstractBuilding.StudentFlat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentFlatTest {
    private StudentFlatTest studentFlat;

    @BeforeEach

    public void setUp() {


        studentFlat = new StudentFlat("Aston University",
                20, 05.2007, 169,
                10, false) {


            @Test

            //Testing Name

            public void nameProperty() {
                // Arrange
                String expected = "Aston University";
                // Acting
                String actual = StudentFlatTest.getNameOfProperty();
                //Assert
                assertEquals(expected, actual);


                //   assertEquals(actual).isEqualTo(expected);
            }

            @Test

            //Testing Number Of complaints
            public void numberofComplaints() {
                int expected = 169;

                int actual = StudentFlat.getNumberOfComplaints();

                assertEquals(expected, actual);
            }

            @Test

            //Testing Number Of parties
            public void numberofParties() {
                int expected = 10;

                int actual = StudentFlat.getNumberOfParties();

                assertEquals(expected, actual);
            }
        };
    }

package abstractBuildingTest;
import abstractBuilding.StudentFlat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentFlatTest {
    private StudentFlat studentFlat;

    @BeforeEach

    public void setUp() {


        studentFlat = new abstractBuilding.StudentFlat("Aston University",
                20, 05.2007, 169,
                10, false);

    }


            @Test

            //Testing Name

            public void testingPropertyNameValue() {
                // Arrange
                String expected = "Aston University";
                // Acting
                String actual = studentFlat.getNameOfProperty();
                //Assert
                assertEquals(expected, actual);


                //   assertEquals(actual).isEqualTo(expected);
            }

            @Test

            //Testing Number Of complaints
            public void numberofComplaints() {
                int expected = 169;

                int actual = studentFlat.getNumberOfComplaints();

                assertEquals(expected, actual);
            }

            @Test

            //Testing Number Of parties
            public void numberofParties() {
                int expected = 10;

                int actual = studentFlat.getNumberOfParties();

                assertEquals(expected, actual);
            }
            //is the Aparment Cleaned after the semester
            @Test
            public void isApartmentCleaned(){
                boolean expected = false;

                boolean actual = studentFlat.isProperlyCleanedAfterSemester();

                assertEquals(expected,actual);
            }

        }

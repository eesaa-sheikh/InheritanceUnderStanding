package AbstractBuilding;

import java.time.LocalDate;
import java.util.Date;

public class Mansion extends AbstractBuilding {

    private int swimmingPool;
    public int numberOfSportsCars;
    private int numberOfChefs;
    private boolean doesItHaveALibrary;

    //Constructor

    public Mansion (String nameOfProperty,
                   int numberOfRooms, Double dateOfConstruction,
                   boolean doesItHaveALibrary,
                   int swimmingPool,
                   int numberOfSportsCars,
                   int numberOfChefs){


        super(nameOfProperty,dateOfConstruction,numberOfRooms );

        //references for this Mansion Class alone
        this.doesItHaveALibrary = doesItHaveALibrary;
        this.swimmingPool =swimmingPool;
        this.numberOfSportsCars = numberOfSportsCars;
        this.numberOfChefs = numberOfChefs;
    }

    //setters nad Getters

    //Does it have a Library
    public boolean isDoesItHaveALibrary() {
        return doesItHaveALibrary;
    }


    //Swimming pool
    public int getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(int swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    //Number of sports cars
    public int getNumberOfSportsCars() {
        return numberOfSportsCars;
    }

    public void setNumberOfSportsCars(int numberOfSportsCars) {
        this.numberOfSportsCars = numberOfSportsCars;
    }

    // Number of Chef
    public int getNumberOfChefs() {
        return numberOfChefs;
    }

    public void setNumberOfChefs(int numberOfChefs) {
        this.numberOfChefs = numberOfChefs;
    }
}
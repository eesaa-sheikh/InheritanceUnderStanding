package abstractBuilding;

public abstract class AbstractBuilding {

    protected String nameOfProperty;

    protected Double dateOfConstruction;

    protected int numberOfRooms;


    public AbstractBuilding (String nameOfProperty, Double dateOfConstruction, int numberOfRooms){ // reference all this in the super class
        // in the constructor.

        this.nameOfProperty=nameOfProperty;
        this.dateOfConstruction= dateOfConstruction;
        this.numberOfRooms=numberOfRooms;
    }
    //Setters & Getters

    // Name of property
    public String getNameOfProperty() {
        return nameOfProperty;
    }

    public void setNameOfProperty(String nameOfProperty) {
        this.nameOfProperty = nameOfProperty;
    }

    // Name of dateOfConstruction

    public Double getDateOfConstruction() {
        return dateOfConstruction;
    }

    public void setDateOfConstruction(Double dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }


    // Number of rooms

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}

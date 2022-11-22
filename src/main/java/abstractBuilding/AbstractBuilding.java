package abstractBuilding;

public abstract class AbstractBuilding {

    protected String nameOfProperty;

    protected Double dateOfConstruction;

    protected int numberOfRooms;
    protected double price;

    //  protected double price;

    public AbstractBuilding(String nameOfProperty, Double dateOfConstruction, int numberOfRooms, double price) { // reference all this in the super class
        // in the constructor.

        this.nameOfProperty = nameOfProperty;
        this.dateOfConstruction = dateOfConstruction;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
        //  this.price =price;
    }

    //Testing method

    public String makeHouseHoldOccuption() {

        return String.format("%s: has a CEO",this.nameOfProperty);
    }


    //Overload method
    public String makeHouseHoldOccuption(String occupation) {
        return String.format("my household is a %s, and my occupation is %s ",
                this.nameOfProperty, makeHouseHoldOccuption());
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price
//    }


    //abstract method for costs of inflation


}

package abstractBuilding;

public class StudentFlat extends AbstractBuilding {

    private int numberOfComplaints;
    private int numberOfParties;
    private final boolean properlyCleanedAfterSemester;

    public StudentFlat(
            //////////////////////////////////////////////////// Constructor from the parent class
            String nameOfProperty,
            double price,
            int numberOfRooms,
            Double dateOfConstruction,
            /////////////////////////////////////////////////// new class values shown below
            int numberOfComplaints,
            int numberOfParties,
            boolean properlyCleanedAfterSemester) {
        //Super Properties needs the parent class constructor included in.
        super(nameOfProperty, dateOfConstruction, numberOfRooms,price);


        this.numberOfComplaints = numberOfComplaints;
        this.numberOfParties = numberOfParties;
        this.properlyCleanedAfterSemester = properlyCleanedAfterSemester;
    }


    //Setters and getters:


    //number of complaints;
    public int getNumberOfComplaints() {
        return numberOfComplaints;
    }

    public void setNumberOfComplaints(int numberOfComplaints) {
        this.numberOfComplaints = numberOfComplaints;
    }

    //number of parties;
    public int getNumberOfParties() {
        return numberOfParties;
    }

    public void setNumberOfParties() {
        this.numberOfParties = numberOfParties;
    }

    //boolean to see if the flat is properly cleaned
    public boolean isProperlyCleanedAfterSemester() {
        return properlyCleanedAfterSemester == true;
    }


    @Override
    public String makeHouseHoldOccuption(){
        return "Students";
    }

    @Override
    public Double inflationCost() {
        double earlyCostOfStudentFlat = 2_000;
        this.price = (((this.price - earlyCostOfStudentFlat)/earlyCostOfStudentFlat) * 100)/12;
        return this.price;
    }
}








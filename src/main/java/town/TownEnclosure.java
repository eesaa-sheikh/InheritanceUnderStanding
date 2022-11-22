package town;

import abstractBuilding.AbstractBuilding;

import java.util.ArrayList;
public class TownEnclosure {
    private String townName;
    private ArrayList<AbstractBuilding> abstractBuildings;

    public TownEnclosure(String townName){


        this.townName=townName;
        this.abstractBuildings= new ArrayList<>();
    }
    //Method Overloading


    //Getters and Setters


    //townName
    public String getTownName(){
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    //place to add newBuildings
    public ArrayList<AbstractBuilding> getAbstractBuildings() {
        return abstractBuildings;
    }

    public void setAbstractBuildings(ArrayList<AbstractBuilding> abstractBuildings) {
        this.abstractBuildings = abstractBuildings;
    }

    public int countProperty(){
        return this.abstractBuildings.size();

    }

    public void addProperty(AbstractBuilding abstractBuilding){
        this.abstractBuildings.add(abstractBuilding);
    }
}

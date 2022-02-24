package farm;

public class Organism {
    protected int numLegs;

//    public Organism(){
//
//    }



    protected void setNumLegs(int newNumLegs){
        this.numLegs = newNumLegs;
    }

    public Organism(int numLegs){
        this.numLegs = numLegs;
    }

    public int getNumLegs(){
        return this.numLegs;
    }
}


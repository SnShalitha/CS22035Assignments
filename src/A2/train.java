package A2;

public class train {
    public String trainID;
    public int numberOfPassengers;
    public String model;
    public int departure;

    train(String inTID,int inNumPassengers,String inModel,int departure)
    {
        this.trainID = inTID;
        this.numberOfPassengers = inNumPassengers;
        this.model = inModel;
        this.departure=departure;
    }
}

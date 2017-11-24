package A2;

public class station {
    public String stationID;
    public String stationName;
    public double distance; //Distance from 0 Point
    public int inCount;
    public int outCount;

    station (String inSID,String inStaName,double inDist)
    {
        this.stationID = inSID;
        this.stationName = inStaName;
        this.distance = inDist;
    }
}

package A2;

import java.text.SimpleDateFormat;
import java.util.Date;
public class ticket {

    public String ticketID;
    public station inStation;
    public station outStation;
    public int ticket_Class;
    public double distance;
    public double cost;
    public String issueDate;
    public int timeNow;
    public train travelledTrain;


    ticket(station inStat,train inTrain,int ticket_Class,int timeNow) //This constructor will initially get the inStation and create a A2.ticket object with the issueTime
    {
        this.timeNow=timeNow;
        this.ticket_Class=ticket_Class;
        this.inStation = inStat;
        this.travelledTrain = inTrain;
        issueDate = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    void issueTicket(station outStat) //This method will issue the A2.ticket, and store the distance travelled
    {
        this.outStation = outStat;
        double distance = outStation.distance - inStation.distance;
        if (distance<0)
            this.distance = distance*-1;
        else
            this.distance = distance;
    }
}

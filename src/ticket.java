import java.text.SimpleDateFormat;
import java.util.Date;
public class ticket {

    public String ticketID;
    public station inStation;
    public station outStation;
    public int distance;
    public double cost;
    public String issueDate;
    public train travelledTrain;

    ticket(station inStat,train inTrain) //This constructor will initially get the inStation and create a ticket object with the issueTime
    {
        this.inStation = inStat;
        this.travelledTrain = inTrain;
        issueDate = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    void issueTicket(station outStat) //This method will issue the ticket, and store the distance travelled
    {
        this.outStation = outStat;
        this.distance = outStation.distance - inStation.distance;
    }
}

package A2;

public class user {
    public String NIC;
    public String name;
    public int contactNumber;
    public String email;
    public ticket tickets;

    user(String inNIC,String inName,int inNumber,String inEmail)
    {
        this.NIC = inNIC;
        this.name = inName;
        this.contactNumber = inNumber;
        this.email = inEmail;
    }
    void enterStation(station inStation,train inTrain)
    {
        tickets = new ticket(inStation,inTrain);
    }

    void exitStation(station outStat)
    {
        tickets.issueTicket(outStat);
        this.calculateCost(tickets);
        System.out.println("Ticket ID"+tickets.ticketID+" cost is Rs."+tickets.cost);
    }

    void calculateCost(ticket inTicket)
    {
        if (inTicket.distance<30) inTicket.cost = 30;
        else inTicket.cost = 100;
    }
}

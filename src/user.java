public class user {
    public String NIC;
    public String name;
    public int contact;
    public String email;
    public ticket tickets[];

    void enterStation(station inStation,train inTrain)
    {
        tickets[tickets.length+1] = new ticket(inStation,inTrain);
    }

    void exitStation(station outStat)
    {
        tickets[tickets.length].issueTicket(outStat);
        this.calculateCost(tickets[tickets.length]);
        System.out.println("Ticket ID"+tickets[tickets.length].ticketID+" cost is Rs."+tickets[tickets.length].cost);
    }

    void calculateCost(ticket inTicket)
    {
        if (inTicket.distance<30) inTicket.cost = 30;
        else inTicket.cost = 100;
    }
}

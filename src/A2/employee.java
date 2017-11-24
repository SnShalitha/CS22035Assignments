package A2;

public class employee extends user {
    public String empID;
    public double salary;
    String department;

    void calculateCost(ticket inTicket,double discount)
    {
        double cost = 0.0;
        if (inTicket.distance<30) cost = 30;
        else cost = 100;
        inTicket.cost = cost*(1-0.01*discount);
    }

}

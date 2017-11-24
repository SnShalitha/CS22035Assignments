package A2;

public class employee extends user {
    public String empID;
    public double salary;
    public String department;

    employee(String inNIC, String inName, int inNumber, String inEmail,String inEmpID,double inSal,String inDept) {
        super(inNIC, inName, inNumber, inEmail);
        this.empID = inEmpID;
        this.salary = inSal;
        this.department = inDept;
    }

    void calculateCost(ticket inTicket,double discount)
    {
        double cost = 0.0;
        if (inTicket.distance<30) cost = 30;
        else cost = 100;
        inTicket.cost = cost*(1-0.01*discount);
    }

}

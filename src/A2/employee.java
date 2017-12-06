package A2;

import static javafx.application.Platform.exit;

public class employee extends user {
    public String empID;
    public double salary;
    public String department;

    employee(String inNIC, String inName, int inNumber, String inEmail, String inEmpID, double inSal, String inDept) {
        super(inName);
        super.setContactNumber(inNumber);
        super.setEmail(inEmail);
        super.setNIC(inNIC);
        this.empID = inEmpID;
        this.salary = inSal;
        this.department = inDept;
    }


    void calculateCost(ticket inTicket, double discount, int ticket_Class) throws TrainException {
        try {
            if ((inTicket.travelledTrain.departure - inTicket.timeNow) >= 0030)
                throw new TrainException("Train HAs Left Already");

        } catch (TrainException ex) {
            //ex.TrainException();
            exit();
        }
        double cost = 0.0;
        if (ticket_Class == 3) {
            if (inTicket.distance < 150)
                cost = 150;
            else if (inTicket.distance < 100)
                cost = 100;
            else if (inTicket.distance < 60)
                cost = 50;
            else if (inTicket.distance < 30)
                cost = 10;
        } else if (ticket_Class == 2) {
            if (inTicket.distance < 150) {
                cost = 2 * 150;
            } else if (inTicket.distance < 100) {
                cost = 2 * 100;
            } else if (inTicket.distance < 60) {
                cost = 2 * 50;
            } else if (inTicket.distance < 30) {
                cost = 2 * 10;
            }

        } else if (ticket_Class == 1) {
            if (inTicket.distance < 150)
                cost = 3 * 150;
            else if (inTicket.distance < 100)
                cost = 3 * 100;
            else if (inTicket.distance < 60) {
                cost = 3 * 50;
            } else if (inTicket.distance < 30) {
                cost = 3 * 10;
            }
        }

        inTicket.cost = cost*(1-0.01*discount);
    }
}

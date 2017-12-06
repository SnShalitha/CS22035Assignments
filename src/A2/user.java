package A2;

public class user {
    private String NIC;
    public String name;
    private int contactNumber;
    private String email;
    public ticket tickets;

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    user(String inName) {
        this.name = inName;

    }

    void enterStation(station inStation, train inTrain, int ticket_Class, int time) {
        tickets = new ticket(inStation, inTrain, ticket_Class, time);
    }

    void exitStation(station outStat) {
        tickets.issueTicket(outStat);
            try {
              this.calculateCost(tickets);
            } catch (TrainException ex) {
                ex.printStackTrace();
            }
        System.out.println("Ticket ID " + tickets.ticketID + " cost is Rs." + tickets.cost);
    }

    void calculateCost(ticket inTicket) throws TrainException {

        int dif = inTicket.travelledTrain.departure - inTicket.timeNow;

        if ((inTicket.travelledTrain.departure - inTicket.timeNow) <= 0030) {
          //  System.out.println(dif);
            throw new TrainException("Train HAs Left Already");

        } else {

            if (inTicket.ticket_Class == 3) {
                if (inTicket.distance < 150)
                    inTicket.cost = 150;
                else if (inTicket.distance < 100)
                    inTicket.cost = 100;
                else if (inTicket.distance < 60)
                    inTicket.cost = 50;
                else if (inTicket.distance < 30)
                    inTicket.cost = 10;
            } else if (inTicket.ticket_Class == 2) {
                if (inTicket.distance < 150)
                    inTicket.cost = 2 * 150;
                else if (inTicket.distance < 100) {
                    inTicket.cost = 2 * 100;
                } else if (inTicket.distance < 60) {
                    inTicket.cost = 2 * 50;
                } else if (inTicket.distance < 30) {
                    inTicket.cost = 2 * 10;
                }
            } else if (inTicket.ticket_Class == 1) {
                if (inTicket.distance < 150) {
                    inTicket.cost = 3 * 150;
                } else if (inTicket.distance < 100) {
                    inTicket.cost = 3 * 100;
                } else if (inTicket.distance < 60) {
                    inTicket.cost = 3 * 50;
                } else if (inTicket.distance < 30) {
                    inTicket.cost = 3 * 10;
                }
            }


        }
    }
}
package A2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class  Main {

    public static void main(String[] args) {

        railway SLR = new railway("SLR");

        station S1 = new station("S001","Fort",0);
        station S2  = new station("S002","Maradana",10);
        station S3  = new station("S003","Kandy",100);
        station S4 = new station("S004","Galle",-130);

        train T1 = new train("T1",300,"T1234",1200);
        train T2 = new train("T2",300,"T1454",1300);

        user P1 = new user("Saman" );

        P1.setNIC("9123456V");
        P1.setContactNumber(071123456);
        P1.setEmail("saman@test.com");

        accountant E1 = new accountant("93373737V","Suman",0771234567,"suman@test.com","E1",555000,"Accounts");

        Calendar cal = Calendar.getInstance();

        DateFormat dateFormat = new SimpleDateFormat("HHmm");

        try {
            int timeForCal=1300; //hard coded time to chk  exception
           //  int timeForCal=Integer.valueOf((dateFormat.format(cal.getTime())).toString()); // this extractx time from System
            P1.enterStation(S1,T1,3,timeForCal);
            P1.exitStation(S4);
            E1.enterStation(S2,T2,2,timeForCal);
            E1.exitStation(S3);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }

    }
}

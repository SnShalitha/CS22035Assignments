package A2;

public class Main {

    public static void main(String[] args) {
        railway SLR = new railway("SLR");
        station S1 = new station("S001","Fort",0);
        station S2  = new station("S002","Maradana",10);
        station S3  = new station("S003","Kandy",100);
        station S4 = new station("S004","Galle",-130);
        train T1 = new train("T1",300,"T1234");
        train T2 = new train("T2",300,"T1454");
        user P1 = new user("9123456V","Saman",071123456,"saman@test.com");
        accountant E1 = new accountant("93373737V","Suman",0771234567,"suman@test.com","E1",555000,"Accounts");
        P1.enterStation(S1,T1);
        E1.enterStation(S2,T2);
        P1.exitStation(S4);
        E1.exitStation(S3);
    }
}

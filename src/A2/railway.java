package A2;

public class railway {
    public String railwayName;
    public int tripCount;
    public float totalIncomeTrips;
    public float expenses;

    railway(String inName)
    {
        this.railwayName = inName;
        tripCount = 0;
        totalIncomeTrips = 0;
        expenses = 0;
    }
}

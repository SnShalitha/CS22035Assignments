package A2;

public class railway {
    public String railwayName;
    private int tripCount;
    private float totalIncomeTrips;
    private float expenses;

    railway(String inName)
    {
        this.railwayName = inName;
        tripCount = 0;
        totalIncomeTrips = 0;
        expenses = 0;
    }

    public float getTotalIncomeTrips() {
        return totalIncomeTrips;
    }

    public void setTotalIncomeTrips(float totalIncomeTrips) {
        this.totalIncomeTrips = totalIncomeTrips;
    }


    public void setExpenses(float expenses) {
        this.expenses = expenses;
    }

    public float getExpenses() {
        return expenses;
    }

    public void setTripCount(int tripCount) {
        this.tripCount = tripCount;
    }

    public int getTripCount() {
        return tripCount;
    }
}

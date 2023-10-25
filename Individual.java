package entities;

public class Individual extends TaxPayer {

    public Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, double anuallIncome, double healthExpenditures) {
        super(name, anuallIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnuallIncome() < 2000.0){
            return getAnuallIncome() *0.15 - healthExpenditures*0.5;
        }else{
            return getAnuallIncome()*0.25 - healthExpenditures*0.5;
        }
    }
}

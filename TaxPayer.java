package entities;

public abstract class TaxPayer {

    public String name;
    public double anuallIncome;

    public TaxPayer(){
    }

    public TaxPayer(String name, double anuallIncome) {
        this.name = name;
        this.anuallIncome = anuallIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnuallIncome() {
        return anuallIncome;
    }

    public void setAnuallIncome(double anuallIncome) {
        this.anuallIncome = anuallIncome;
    }
    public abstract Double tax();
}

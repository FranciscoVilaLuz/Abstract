package entities;

public class Company extends TaxPayer{

    public Integer numberOfEmployees;

    public Company(){
    }

    public Company(String name, double anuallIncome, int numberOfEmployees) {
        super(name, anuallIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    @Override
    public Double tax() {
        if (numberOfEmployees >= 10) {

            return getAnuallIncome() * 0.14;

        } else {
            return getAnuallIncome() *0.16;

        }
    }
}


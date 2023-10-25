import entities.Individual;
import entities.TaxPayer;
import entities.Company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {


            Locale.setDefault(Locale.US);
            Scanner scan = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            List<TaxPayer> list= new ArrayList<>();

        System.out.print("Enter the number of tax prayers: ");
        int n = scan.nextInt();

        for (int i = 1; i <=n ; i++) {
            System.out.println("Tax payer #" + i + "data:");
            System.out.print("Individual or company (i/c): ");
            char type=scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name=scan.nextLine();
            System.out.print("Anual income:");
            double income=scan.nextDouble();

            if (type== 'i'){
                System.out.print("Helth expenditures: ");
                double healthExpenditures=scan.nextDouble();
                list.add(new Individual(name, income, healthExpenditures));
            }else{
                System.out.print("Number of employees: ");
                int numberOfEmployees= scan.nextInt();
                list.add(new Company(name, income, numberOfEmployees));
            }
        }
        double sum=0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp:list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        }
    }

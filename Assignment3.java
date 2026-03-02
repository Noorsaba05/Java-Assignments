package employee;

public class Emp {
    // Data members
    public String name;
    public int empId;
    public String category;
    public double basicPay, hra, da, pf, allowance;
    public double grossPay, incomeTax, netPay;

    // Constructor to initialize basic details
    public Emp(String name, int empId, String category, double basicPay, double allowance) {
        this.name = name;
        this.empId = empId;
        this.category = category;
        this.basicPay = basicPay;
        this.allowance = allowance;
    }

    // Method to calculate all salary components
    public void calculateSalary() {
        hra = basicPay * 0.10;         // 10% of Basic Pay
        da = basicPay * 0.50;          // 50% of Basic Pay
        pf = basicPay * 0.12;          // 12% of Basic Pay
        
        grossPay = basicPay + hra + da + allowance;
        
        incomeTax = grossPay * 0.05;   // 5% of Gross Pay
        netPay = grossPay - (pf + incomeTax);
    }

    // Method to print the values
    public void printDetails() {
        System.out.println("--- Employee Salary Slip ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + empId + " | Category: " + category);
        System.out.println("Basic Pay: Rs." + basicPay);
        System.out.println("HRA: Rs." + hra);
        System.out.println("DA: Rs." + da);
        System.out.println("Allowance: Rs." + allowance);
        System.out.println("Gross Pay: Rs." + grossPay);
        System.out.println("Provident Fund (PF): Rs." + pf);
        System.out.println("Income Tax: Rs." + incomeTax);
        System.out.println("----------------------------");
        System.out.println("Net Pay: Rs." + netPay);
    }
}
import employee.Emp; // Importing the class from your custom package

public class Main {
    public static void main(String[] args) {
        // Create an employee object with initial details
        Emp emp1 = new Emp("Noor", 101, "IT Staff", 45000.00, 2500.00);

        // Call the methods to calculate and display
        emp1.calculateSalary();
        emp1.printDetails();
    }
}

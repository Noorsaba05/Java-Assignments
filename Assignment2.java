import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

class Employee {
    protected int id;
    protected String name;
    protected Date dateOfBirth;

    public Employee(int id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + sdf.format(dateOfBirth));
    }
}

class Manager extends Employee {
    protected double salary;

    public Manager(int id, String name, Date dateOfBirth, double salary) {
        super(id, name, dateOfBirth);
        this.salary = salary;
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Base Salary: " + salary);
    }
}

class SalesManager extends Manager {
    private double commission;

    public SalesManager(int id, String name, Date dateOfBirth, double salary, double commission) {
        super(id, name, dateOfBirth, salary);
        this.commission = commission;
    }

  
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Commission:" + commission);
        System.out.println("Total Pay: " + (salary + commission));
    }
}

public class Assignment2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateInputFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("--- Enter Sales Manager Details ---");

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Date of Birth: ");
        String dobString = scanner.nextLine();
        Date dob = dateInputFormat.parse(dobString);

        System.out.print("Enter Base Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Commission: ");
        double commission = scanner.nextDouble();

        SalesManager sm = new SalesManager(id, name, dob, salary, commission);

        System.out.println("\n--- Displaying Details ---");
        sm.displayInfo();
    }
}

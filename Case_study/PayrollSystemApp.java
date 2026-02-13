import java.util.ArrayList;
import java.util.List;

class Employee {
    private String employeeId;
    private String name;
    private String role;
    private double baseSalary;
    private double finalSalary;

    public Employee(String employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.finalSalary = 0;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double calculateSalary() {
        switch (role) {
            case "Manager":
                finalSalary = baseSalary + (baseSalary * 0.20);
                break;
            case "Developer":
                finalSalary = baseSalary + (baseSalary * 0.10);
                break;
            case "Designer":
                finalSalary = baseSalary + (baseSalary * 0.05);
                break;
            case "Intern":
                finalSalary = 1000;
                break;
            default:
                finalSalary = baseSalary;
                break;
        }
        return finalSalary;
    }

    public void applyDeduction(double amount) {
        if (amount > 0 && amount <= finalSalary) {
            finalSalary -= amount;
            System.out.println("Deduction of " + amount + " applied to " + name);
        } else {
            System.out.println("Invalid deduction amount for " + name);
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Final Salary: " + finalSalary);
        System.out.println("----------------------------");
    }
}

class Payroll {
    private List<Employee> employees;

    public Payroll() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getEmployeeId());
    }

    public void calculateAllSalaries() {
        for (Employee emp : employees) {
            emp.calculateSalary();
        }
    }

    public Employee findEmployeeById(String employeeId) {
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equalsIgnoreCase(employeeId)) {
                return emp;
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
        }
    }
}

public class PayrollSystemApp {
    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        Employee e1 = new Employee("E101", "Nidhi", "Manager", 5000);
        Employee e2 = new Employee("E102", "Rahul", "Developer", 4000);
        Employee e3 = new Employee("E103", "Anita", "Designer", 3500);
        Employee e4 = new Employee("E104", "Karan", "Intern", 2000);

        payroll.addEmployee(e1);
        payroll.addEmployee(e2);
        payroll.addEmployee(e3);
        payroll.addEmployee(e4);

        System.out.println("\nCalculating Salaries...\n");
        payroll.calculateAllSalaries();

        e2.applyDeduction(300);
        e1.applyDeduction(500);

        System.out.println("\nEmployee Details:\n");
        payroll.displayAllEmployees();

        Employee found = payroll.findEmployeeById("E102");
        if (found != null) {
            System.out.println("Found Employee:");
            found.displayEmployeeDetails();
        } else {
            System.out.println("Employee not found.");
        }
    }
}

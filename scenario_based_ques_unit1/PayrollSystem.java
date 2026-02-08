
class Employee {

    int id;
    String name;
    double salary;

    Employee() {
        id = 0;
        name = "Not Assigned";
        salary = 0.0;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Rahul", 45000);

        System.out.println("Default Constructor:");
        e1.display();

        System.out.println();

        System.out.println("Parameterized Constructor:");
        e2.display();
    }
}

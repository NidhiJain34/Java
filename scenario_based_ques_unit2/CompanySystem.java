package scenario_based_ques_unit2;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {

    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class CompanySystem {
    public static void main(String[] args) {

        Manager m1 = new Manager("Rahul", 50000, 10000);

        System.out.println("Final Salary: " + m1.calculateSalary());
    }
}

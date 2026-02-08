package scenario_based_ques_unit2.staff;

public class Teacher {

    public String name = "Amit";
    protected String subject = "Java";
    private int salary = 40000;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

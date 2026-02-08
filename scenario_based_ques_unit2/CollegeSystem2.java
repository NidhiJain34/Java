package scenario_based_ques_unit2;



class Person {

    String name;

    Person(String name) {
        this.name = name;
    }
}

class Teacher extends Person {

    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
}

class HOD extends Teacher {

    String department;

    HOD(String name, String subject, String department) {
        super(name, subject);
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class CollegeSystem2 {
    public static void main(String[] args) {

        HOD h1 = new HOD("Anita", "Computer Science", "IT");

        h1.display();
    }
}


class Student {

    String college = "ABC College";

    Student() {
        System.out.println("Student Constructor");
    }

    void showCollege() {
        System.out.println("College Name: " + college);
    }
}

class Result extends Student {

    String name = "Nidhi";

    Result() {

        // Calling parent constructor
        super();

        System.out.println("Result Constructor");
    }

    void display() {

        // Accessing parent variable
        System.out.println("College: " + super.college);

        // Calling parent method
        super.showCollege();

        // Child class variable
        System.out.println("Student Name: " + name);
    }
}

public class only_super {
    public static void main(String[] args) {

        Result r = new Result();
        r.display();
    }
}

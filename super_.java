// Parent Class
class Person {

    String name = "Unknown";

    // Parent Class Constructor
    Person(String name) {
        this.name = name;   // this refers to current object
        System.out.println("Parent Constructor Called");
    }

    void display() {
        System.out.println("Name from Parent Class: " + name);
    }
}

// Child Class
class Student extends Person {

    int rollNo;

    // Child Class Constructor
    Student(String name, int rollNo) {

        // Calling parent class constructor
        super(name);   // super calls parent constructor

        this.rollNo = rollNo;   // this refers to current class variable

        System.out.println("Child Constructor Called");
    }

    void show() {

        // Calling parent class method
        super.display();   // super calls parent method

        // Using this keyword
        System.out.println("Roll No from Child Class: " + this.rollNo);
    }
}

// Main Class
public class super_{
    public static void main(String[] args) {

        // Creating child object
        Student s = new Student("Nidhi", 15);

        System.out.println("\nStudent Details:");
        s.show();
    }
}

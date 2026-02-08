class Student {

    static String collegeName = "ABC College";

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    static void displayCollege() {
        System.out.println("College: " + collegeName);
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class CollegeSystem {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Amit");
        Student s2 = new Student(2, "Neha");

        Student.displayCollege();

        System.out.println();

        s1.displayStudent();
        System.out.println();
        s2.displayStudent();
    }
}

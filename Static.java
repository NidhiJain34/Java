<<<<<<< HEAD
import java.util.Scanner;

class Student {

    // Static variable (common for all students)
    static String collegeName = "ABC College of Engineering";

    String name;
    int rollNo;
    long prn;

    // Parameterized Constructor
    Student(String n, int r, long p) {
        name = n;
        rollNo = r;
        prn = p;
    }

    // Method to display details
    void display() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Name         : " + name);
        System.out.println("Roll No      : " + rollNo);
        System.out.println("PRN          : " + prn);
    }
}

public class Static {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter PRN: ");
        long prn = sc.nextLong();

        // Creating object
        Student s1 = new Student(name, roll, prn);

        System.out.println("\nStudent Details:");
        s1.display();

        sc.close();
    }
}
=======
import java.util.Scanner;

class Student {

    // Static variable (common for all students)
    static String collegeName = "ABC College of Engineering";

    String name;
    int rollNo;
    long prn;

    // Parameterized Constructor
    Student(String n, int r, long p) {
        name = n;
        rollNo = r;
        prn = p;
    }

    // Method to display details
    void display() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Name         : " + name);
        System.out.println("Roll No      : " + rollNo);
        System.out.println("PRN          : " + prn);
    }
}

public class Static {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter PRN: ");
        long prn = sc.nextLong();

        // Creating object
        Student s1 = new Student(name, roll, prn);

        System.out.println("\nStudent Details:");
        s1.display();

        sc.close();
    }
}
>>>>>>> 88d54c5 (hellooooo)

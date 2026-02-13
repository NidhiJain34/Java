import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
        System.out.println("----------------------------");
    }
}

class StudentGradeManager {
    private List<Student> students;

    public StudentGradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                student.displayStudentDetails();
            }
        }
    }
}

public class GradeSystemApp {
    public static void main(String[] args) {

        StudentGradeManager manager = new StudentGradeManager();

        Student s1 = new Student("Nidhi");
        Student s2 = new Student("Rahul");

        manager.addStudent(s1);
        manager.addStudent(s2);

        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(78);

        s2.addGrade(88);
        s2.addGrade(76);
        s2.addGrade(92);

        manager.displayAllStudents();

        Student found = manager.findStudentByName("Nidhi");
        if (found != null) {
            System.out.println("Average of " + found.getName() + ": " + found.calculateAverage());
        } else {
            System.out.println("Student not found.");
        }
    }
}

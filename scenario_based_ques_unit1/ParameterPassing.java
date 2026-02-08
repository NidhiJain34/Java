class Student {

    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class ParameterPassing {

    static void modify(int x, Student s) {

        x = x + 10;
        s.marks = s.marks + 10;
    }

    public static void main(String[] args) {

        int num = 50;
        Student st = new Student(60);

        System.out.println("Before:");
        System.out.println("Number: " + num);
        System.out.println("Marks: " + st.marks);

        modify(num, st);

        System.out.println();
        System.out.println("After:");
        System.out.println("Number: " + num);
        System.out.println("Marks: " + st.marks);
    }
}

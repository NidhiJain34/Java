import java.util.Scanner;

class Calculator {
    int a, b;

    // Parameterized Constructor
    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void calculate(int choice) {

        switch (choice) {

            case 1:
                System.out.println("Sum = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Division = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}

public class calcuate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        // Creating object using constructor
        Calculator c = new Calculator(num1, num2);

        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        c.calculate(ch);

        sc.close();
    }
}

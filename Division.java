import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int a = sc.nextInt();

        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}

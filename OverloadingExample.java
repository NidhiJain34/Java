public class OverloadingExample {

    static void show(int a) {
        System.out.println("Integer value: " + a);
    }

    static void show(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    public static void main(String[] args) {
        show(10);
        show(10, 20);
    }
}

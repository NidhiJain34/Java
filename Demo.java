public class Demo {

    // Parameterized Method
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        Demo d = new Demo();

        // Passing predefined values
        d.add(10, 20);
    }
}

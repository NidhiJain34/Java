package scenario_based_ques_unit2;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class NewCalculator extends Calculator {

    int add(int a, int b) {
        return (a + b) * 2;
    }
}

public class CalcTest {
    public static void main(String[] args) {

        NewCalculator c1 = new NewCalculator();

        System.out.println(c1.add(5, 3));
        System.out.println(c1.add(2.5, 3.5));
    }
}

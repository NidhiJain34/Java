package scenario_based_ques_unit2;

class Bank {

    final double rate = 8.5;

    final void displayRate() {
        System.out.println("Interest Rate: " + rate);
    }
}

class SBI extends Bank {

    /*
    void displayRate() {
        System.out.println("Rate Changed");
    }
    */
}

public class FinalTest {
    public static void main(String[] args) {

        SBI s1 = new SBI();

        s1.displayRate();
    }
}

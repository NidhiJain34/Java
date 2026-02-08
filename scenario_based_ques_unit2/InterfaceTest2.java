package scenario_based_ques_unit2;

interface Bank {

    int rate = 10;
}

class SBI implements Bank {

    void display() {
        System.out.println("Rate: " + rate);
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {

        SBI s1 = new SBI();

        s1.display();

        /*
        rate = 20;
        */
    }
}

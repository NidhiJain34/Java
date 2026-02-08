package scenario_based_ques_unit2;

class Demo {

    String name;

    Demo(String name) {
        this.name = name;
    }

    protected void finalize() {
        System.out.println(name + " Object Collected");
    }
}

public class GCTest {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Demo d = new Demo("Obj" + i);
            d = null;
        }

        System.gc();
    }
}


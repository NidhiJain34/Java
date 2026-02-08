package scenario_based_ques_unit2;

import java.util.Vector;

class MyThread extends Thread {

    Vector<Integer> v;

    MyThread(Vector<Integer> v) {
        this.v = v;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            v.add(i);
        }
    }
}

public class VectorTest {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        MyThread t1 = new MyThread(v);
        MyThread t2 = new MyThread(v);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }

        System.out.println("Vector Elements: " + v);
    }
}


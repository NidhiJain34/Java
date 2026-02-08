package scenario_based_ques_unit2;

interface Callable {

    void call();
}

interface Camera {

    void takePhoto();
}

class SmartPhone implements Callable, Camera {

    public void call() {
        System.out.println("Calling...");
    }

    public void takePhoto() {
        System.out.println("Photo Taken");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone();

        s1.call();
        s1.takePhoto();
    }
}


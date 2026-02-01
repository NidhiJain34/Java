class A {
    int x = 10;
}

class B {
    int y = 20;
}

class C {
    int z = 30;
}

public class objects {
    public static void main(String[] args) {

        // Creating objects
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        // Accessing variables
        System.out.println("Value of x = " + obj1.x);
        System.out.println("Value of y = " + obj2.y);
        System.out.println("Value of z = " + obj3.z);
    }
}

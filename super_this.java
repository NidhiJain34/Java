<<<<<<< HEAD
class Parent {

    int num = 100;

    Parent() {
        System.out.println("Parent Constructor Called");
    }

    void show() {
        System.out.println("This is Parent Class Method");
    }
}

class Child extends Parent {

    int num = 200;

    Child() {

        // Calling parent constructor
        super();

        // Using this keyword
        System.out.println("Child Constructor Called");
        System.out.println("Value using this: " + this.num);
        System.out.println("Value using super: " + super.num);
    }

    void display() {

        // Calling parent method
        super.show();

        // Calling current class method
        this.showChild();
    }

    void showChild() {
        System.out.println("This is Child Class Method");
    }
}

public class super_this {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
    }
}
=======
class Parent {

    int num = 100;

    Parent() {
        System.out.println("Parent Constructor Called");
    }

    void show() {
        System.out.println("This is Parent Class Method");
    }
}

class Child extends Parent {

    int num = 200;

    Child() {

        // Calling parent constructor
        super();

        // Using this keyword
        System.out.println("Child Constructor Called");
        System.out.println("Value using this: " + this.num);
        System.out.println("Value using super: " + super.num);
    }

    void display() {

        // Calling parent method
        super.show();

        // Calling current class method
        this.showChild();
    }

    void showChild() {
        System.out.println("This is Child Class Method");
    }
}

public class super_this {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
    }
}
>>>>>>> 88d54c5 (hellooooo)

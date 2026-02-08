package scenario_based_ques_unit2;

class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle extends Shape {

    void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for (Shape s : shapes) {
            s.draw();
        }
    }
}

class Parent{
    int x ;
    void x(){
        this.x = 10;
        System.out.println("x= "+x);
    }
}

class child extends Parent{

    void x(){
        super.x();
        this.x = 20;
        System.out.println("x= "+x);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        child c = new child();
        c.x();
    }
}
class CPU {

    int speed = 3200;

    class Processor {

        void display() {
            System.out.println("CPU Speed: " + speed + " MHz");
        }
    }
}

public class CPUSystem {
    public static void main(String[] args) {

        CPU cpu = new CPU();

        CPU.Processor p = cpu.new Processor();

        p.display();
    }
}

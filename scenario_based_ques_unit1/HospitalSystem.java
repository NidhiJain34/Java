
class Doctor {
    int doctorId;
    String name;
    String specialization;

    Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

class Patient {
    int patientId;
    String name;
    String disease;

    Patient(int patientId, String name, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
    }

    void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Disease: " + disease);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiology");
        Patient p1 = new Patient(201, "Amit", "Heart Problem");

        System.out.println("Doctor Details:");
        d1.displayDoctor();

        System.out.println();

        System.out.println("Patient Details:");
        p1.displayPatient();
    }
}

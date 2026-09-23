package Q6;

public class Hospitalmain {
    public static void main(String[] args) {

        // Create multiple Doctor objects
        Doctor d1 = new Doctor(101, "Dr. Amit", "Cardiologist");
        Doctor d2 = new Doctor(102, "Dr. Rahul", "Neurologist");

        // Create multiple Patient objects
        Patient p1 = new Patient(201, "Ravi", 25, "Heart Problem");
        Patient p2 = new Patient(202, "Aman", 30, "Migraine");

        System.out.println("===== DOCTOR DETAILS =====");

        d1.displayDoctorDetails();
        System.out.println();

        d2.displayDoctorDetails();

        System.out.println("\n===== PATIENT DETAILS =====");

        p1.displayPatientDetails();
        System.out.println();

        p2.displayPatientDetails();

        System.out.println("\n===== DOCTOR-PATIENT INTERACTION =====");

        d1.treatPatient(p1);
        d1.prescribeMedicine(p1, "Aspirin");

        System.out.println();

        d2.treatPatient(p2);
        d2.prescribeMedicine(p2, "Paracetamol");

        System.out.println("\n===== MEDICAL STATUS =====");

        p1.showMedicalStatus();
        p2.showMedicalStatus();
    }
}







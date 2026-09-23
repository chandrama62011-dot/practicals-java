package Q6;

public class Doctor {

    int doctorId;
    String doctorName;
    String specialization;

    Doctor(int doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    void displayDoctorDetails() {
        System.out.println("Doctor ID     : " + doctorId);
        System.out.println("Doctor Name   : " + doctorName);
        System.out.println("Specialization: " + specialization);
    }

    void treatPatient(Patient patient) {
        System.out.println(doctorName + " is treating " + patient.patientName);
    }

    void prescribeMedicine(Patient patient, String medicine) {
        System.out.println(doctorName + " prescribed " + medicine
                + " to " + patient.patientName);
    }
}

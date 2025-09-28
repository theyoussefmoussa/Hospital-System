
import java.util.Scanner;

import hospital.Doctor;
import hospital.Hospital;
import hospital.Patient;
import hospital.Search;
import hospital.Sort;

public class App {
    public static int patientSize;
    public static int HospitalSize;
    public static int DoctorSize;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of Hospitals: ");
        int Hospitalsize = scan.nextInt();
        Hospital[] hospitalArr = new Hospital[Hospitalsize];
        App.HospitalSize = Hospitalsize;

        System.out.println("Enter number of Doctors: ");
        int Doctorsize = scan.nextInt();
        Doctor[] doctorArr = new Doctor[Doctorsize];
        App.DoctorSize = Doctorsize;

        System.out.println("Enter number of Patients: ");
        int patientSize = scan.nextInt();
        App.patientSize = patientSize;
        Patient[] patientArr = new Patient[patientSize];

        // ---------------------- Hospitals ----------------------
        for (int i = 0; i < Hospitalsize; i++) {
            System.out.println("Enter Hospital No." + (i + 1) + " Name");
            String HospitalName = scan.next();
            System.out.println("Enter Hospital No." + (i + 1) + " Location");
            String HospitalLoc = scan.next();
            hospitalArr[i] = new Hospital(HospitalName, HospitalLoc);
        }

        // ---------------------- Doctors ----------------------
        for (int i = 0; i < DoctorSize; i++) {
            System.out.println("Enter Doctor No." + (i + 1) + " ID:");
            int DoctorId = scan.nextInt();

            System.out.println("Enter Doctor No." + (i + 1) + " Name:");
            String DoctorName = scan.next();

            System.out.println("Enter Doctor No." + (i + 1) + " Phone:");
            String DoctorPhone = scan.next();

            System.out.println("Enter Doctor No." + (i + 1) + " Specialization:");
            String DoctorSpec = scan.next();
            doctorArr[i] = new Doctor(DoctorId, DoctorName, DoctorPhone, DoctorSpec);
        }

        // ---------------------- Patients ----------------------
        for (int i = 0; i < patientSize; i++) {
            System.out.println("Enter Patient No." + (i + 1) + " ID:");
            int patientId = scan.nextInt();

            System.out.println("Enter Patient No." + (i + 1) + " Name:");
            String patientName = scan.next();

            System.out.println("Enter Patient No." + (i + 1) + " Phone:");
            String patientPhone = scan.next();

            System.out.println("Enter Patient No." + (i + 1) + " Age:");
            int patientAge = scan.nextInt();
            patientArr[i] = new Patient(patientId, patientName, patientPhone, patientAge);
        }

        // ---------------------- Display sorted Hospitals ----------------------
        Sort.sortHospitalsByName(hospitalArr);
        System.out.println("Sorted Hospitals by Name:");
        for (int i = 0; i < HospitalSize; i++) {
            System.out.println(hospitalArr[i].name);
        }

        // ---------------------- Display sorted Doctors ----------------------
        Sort.sortDoctorsById(doctorArr);
        System.out.println("Sorted Doctors by ID:");
        for (int i = 0; i < DoctorSize; i++) {
            System.out.println(doctorArr[i].id);
        }

        // ---------------------- Display sorted Patients ----------------------
        Sort.sortPatientsById(patientArr);
        System.out.println("Sorted Patients by ID:");
        for (int i = 0; i < patientSize; i++) {
            System.out.println(patientArr[i].id);
        }

        // ---------------------- Search for Doctor ----------------------
        System.out.println("Search for specialization:");
        String value = scan.next();
        Search.DoctorSearch(doctorArr, value);

        // ---------------------- Search for Patient ----------------------
        System.out.println("Search for the Patient ID:");
        int id_key = scan.nextInt();
        Search.PatientSearch(patientArr, id_key);

        scan.close();
    }
}

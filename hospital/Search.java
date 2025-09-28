package hospital;
public class Search {

    public static void DoctorSearch(Doctor[] doctorArr, String key){
        boolean found = false;
        for(int i = 0; i < doctorArr.length; i++ ){
            if(doctorArr[i].specialization.equalsIgnoreCase(key)){
                System.out.println("Doctor of specialization '" + key + "': " + doctorArr[i].name);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No doctor found with specialization: " + key);
        }
    }

    public static void PatientSearch(Patient[] patientArr, int key){
        boolean found = false;
        for(int i = 0; i < patientArr.length; i++ ){
            if(patientArr[i].id == key){
                System.out.println("Patient with ID " + key + ": " + patientArr[i].name);
                found = true;
            }
        }
        if(!found){
            System.out.println("No patient found with ID: " + key);
        }
    }
}

package hospital;

public class Sort {

    // Selection Sort for Hospitals
    public static void sortHospitalsByName(Hospital[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getHospitalName().compareTo(arr[minIdx].getHospitalName()) < 0) {
                    minIdx = j;
                }
            }
            Hospital temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // Bubble Sort for Doctors by ID
    public static void sortDoctorsById(Doctor[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].id < arr[minIdx].id) {
                    minIdx = j;
                }
            }
            Doctor temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // Insertion Sort for Patients by ID
    public static void sortPatientsById(Patient[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Patient key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].id > key.id) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

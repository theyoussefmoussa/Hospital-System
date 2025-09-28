package hospital; 

public class Doctor {
    public int id;
    public String name;
    public String phone;
    public String specialization;

    public Doctor(int id, String name, String phone, String specialization) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getDoctorName() {
        return name;

    }
}
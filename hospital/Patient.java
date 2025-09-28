package hospital;

public class Patient {
    public int id;
    public String name;
    public String phone;
    public int age;

    public Patient(int id, String name, String phone, int age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getPatientName() {
        return name;
    }
}

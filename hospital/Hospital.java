package hospital;

public class Hospital {
    public String name;
    public String location;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getHospitalName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
package model;

public class Nurse extends User{

    private String speciality;

    Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Verde");
        System.out.println("Departamento: Nutricion");
        System.out.println();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

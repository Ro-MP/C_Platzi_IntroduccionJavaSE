package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentDoctor> appointmentNurse = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentDoctor> getAppointmentNurse() {
        return appointmentNurse;
    }

    public void addAppointmentNurse(ArrayList<AppointmentDoctor> appointmentNurse) {
        this.appointmentNurse = appointmentNurse;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial Completo");
        System.out.println();
    }

    public Patient(String name, String email){
        super(name, email);
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + " kg.";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) { this.height = height; }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}

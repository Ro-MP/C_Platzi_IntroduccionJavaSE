package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //private static int idSiguiente = 1;
    //int id;  // Autoincrement
    String speciality;
    public static ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Comportamientos

    public Doctor(String name, String email){
        super(name, email);
        //System.out.println("Construyendo el objeto de model.Doctor: " + name);
        //asignId();
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }


    public Doctor(String name, String email, String speciality){
        super(name, email);
        this.speciality =speciality;
        //asignId();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

/*  Asignación automática del ID
    public void showId(){
        System.out.println("ID: " + this.id);
    }

    private void asignId(){
        this.id = idSiguiente;
        idSiguiente++;
    }

     */


     /*
        Con las siguientes dos metodos se agregan citas o se imprimen las ya existentes.
        Se pueden mandar llamar desde Main, sin necesidad de instanciar un objeto.
      */
    public static void addAvailableAppointment(String date, String time) {

        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public static void printAvailabilityAppointment(){
        if (availableAppointments != null) {
            for (AvailableAppointment aA:   availableAppointments) {
                System.out.println("Cita " + aA + ": " + aA.date+ "at " + aA.getTime());
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Pediatria");
        System.out.println();
    }

    /*
            Clase estatica anidada
            Las citas se generas como objetos de esta clase interna
         */
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        AvailableAppointment(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments\nDate: " + date + "\nTime: " + time;
        }
    }
}

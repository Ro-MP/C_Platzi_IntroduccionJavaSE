package model;

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
        System.out.println("Construyendo el objeto de model.Doctor");
        //asignId();
    }

    public Doctor(String name, String email, String speciality){
        super(name, email);
        this.speciality =speciality;
        //asignId();
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
    public static void addAvailableAppointment(Date date, String time) {
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

    /*
            Clase estatica anidada
            Las citas se generas como objetos de esta clase interna
         */
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
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

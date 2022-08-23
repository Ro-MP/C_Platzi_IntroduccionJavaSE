import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static int idSiguiente = 1;
    int id;  // Autoincrement
    String name;
    String email;
    String speciality;


    static ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Comportamientos

    Doctor(){
        System.out.println("Construyendo el objeto de Doctor");
        asignId();
    }

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        asignId();
    }

    public void showName(){
        System.out.println(name);
        System.out.println();
    }

    public void showId(){
        System.out.println("ID: " + this.id);
    }

    private void asignId(){
        this.id = idSiguiente;
        idSiguiente++;
    }


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
    }
}

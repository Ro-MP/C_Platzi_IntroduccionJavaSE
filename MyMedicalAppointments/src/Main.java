import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        // Declarando Objeto
        Doctor myDoctor;
        // Instanciando objeto
        myDoctor = new Doctor("Alealejandro", "a@.com");
        // Llamando metodo showName
        myDoctor.showName();

        // Instanciando objeto con metodo constructor con parametro name
        Doctor myDoctor2 = new Doctor("Roberto","r@.com");

        //myDoctor.showId();
        //myDoctor2.showId();

        /*showMenu();   */

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");

        /* Ejemplo de almacenamiento de direccion en STACK y objeto en HEAP
          patient2 se le asigna direccion de patient
          si modificamos valor de patient2, se modifica en HEAP por lo que
          se modifican los valores tambien de patient
          */
        /*
        System.out.println(patient);
        model.Patient patient2 = patient;
        System.out.println(patient2);
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2.setName("Ricardo");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
         */

        Doctor.addAvailableAppointment(new Date(), "12:50");
        Doctor.addAvailableAppointment(new Date(), "18:30");
        Doctor.printAvailabilityAppointment();
        System.out.println(patient.toString());
        System.out.println();
        System.out.println(Doctor.availableAppointments.toString());
    }




}

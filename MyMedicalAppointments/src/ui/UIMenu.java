package ui;

import model.Doctor;
import model.Patient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    // Variables para conocer al usuario loggeado
    public static Doctor doctorLogged;
    public static Patient patientLogged;


    // Muestra el menu y sus posibles opciones con un Switch, te direcciona a la opciónkn seleccionada
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType) {
        // userType = 1  -> Doctor
        // userType = 2  ->Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Escorza", "ale@ale.com"));
        doctors.add(new Doctor("Beto Vazquez", "beto@beto.com"));
        doctors.add(new Doctor("Carime Carmona", "cari@cari.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Rodrigo Rodriguez", "ro@ro.com"));
        patients.add(new Patient("Anahí Navarro", "an@na.com"));
        patients.add(new Patient("Cornelio Corona", "co@co.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert you email: [ex@ex.com]");
            Scanner sc = new Scanner((System.in));
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }

            }

        }while (!emailCorrect);
    }


    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i <= 3; i++) {
                        System.out.println(i + ". " + MONTHS[i-1]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }


}

package ui;

import model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Welcome Dr " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner((System.in));
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    System.out.println("Appointments booked");
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
                    System.out.println("Insert a correct option");
            }

        }while(response != 0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int responseMonth = 0;
        do {
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select a month");
            for (int i = 0; i<3; i++) {
                System.out.println(String.valueOf(i+1) + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner((System.in));
            responseMonth = Integer.parseInt(sc.nextLine());

            if (responseMonth > 0 && responseMonth < 4) {
                //1,2,3
                System.out.println(responseMonth + " . " + UIMenu.MONTHS[responseMonth-1]);
                System.out.println("Inset the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("Your date is: "+ date + "\n1. Correct \n2. Change Date");
                int responseDate = Integer.parseInt(sc.nextLine());
                if (responseDate == 2) continue; // Salta la sig linea sin salirse del ciclo

                int responseTime = 0;
                String time = "";
                do{
                    System.out.println("Insert the time Available for date " + date + "[16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: "+ time + "\n1. Correct \n2. Change time");
                    responseTime = Integer.parseInt(sc.nextLine());
                }while(responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointment(UIMenu.doctorLogged);


            }else if (responseMonth == 0){
                showDoctorMenu();
            }

        }while(responseMonth != 0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 && !doctorAvailableAppointments.contains(doctor)){
            doctorAvailableAppointments.add(doctor);
        }
    }
}

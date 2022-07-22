import java.util.Scanner;

public class Bucles {

    static boolean isTurnInLight = false;

    public static void main(String[] args) {

        // --  DO - WHILE
        System.out.println("---  Do-While  ---");
        int response = 0;
        do {
            System.out.println("Selecciona numero de opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        } while (response != 0);
        System.out.println(" ");


        //  -- WHILE
        System.out.println("---  While  ---");
        turnOnOffLight();

        int i = 1;
        while (isTurnInLight && i<=10){
            printSos();
            i++;
        }


        //  -- FOR
        System.out.println("---  FOR  ---");
        for (int j = 0; j <10 ; j++) {
            printSos();
        }

    }

    public static void printSos(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){

        isTurnInLight = (isTurnInLight)?false:true;

        return isTurnInLight;
    }
}



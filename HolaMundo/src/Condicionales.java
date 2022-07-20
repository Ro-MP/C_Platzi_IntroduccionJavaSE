public class Condicionales {
    public static void main(String[] args) {

        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        /**
         *   If
         */
        System.out.println("--- IF ---");
        if (isBluetoothEnabled){
            // Send file
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            System.out.println("Enciende tu bluetooth");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println("Se han enviado " + fileSended);
        System.out.println(" ");



        /**
         *    Switch
         */
        System.out.println("--- SWITCH ---");
        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opción correcta");
        }

    }
}

public class DataTypes {
    public static void main(String[] args) {

        // Datos Enteros  y sus valores máximos
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;  // Termina en L

        // Datos decimales
        float f = 3.14152653F;  // Termina en F
        double d = 3.1415265359;

        // Caracteres
        char c = 'c';   // Con comilla simple

        // Lógicos
        boolean bo = true;

        /**
         *  A partir de java 10 no es necesario expresar que tipo de dato es.
         */

        var salary = 1000;  // Int
        // Pension 3%
        var pension = salary*0.03; //double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Rodrigo Picazo";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}

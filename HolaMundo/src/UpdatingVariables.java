public class UpdatingVariables {
    public static void main(String[] args) {

        int salary = 1000;

        //Bono de $200
        int bono = 200;
        salary += bono;
        System.out.println(salary);

        // Pension descuento $50
        int pension = 50;
        salary -= pension;
        System.out.println(salary);

        //2 hrs extra $30 c/u
        // comida: $45
        salary += (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Rodrigo";
        employeeName += " Marquez";
        System.out.println(employeeName);

        employeeName = "Jose " + employeeName;
        System.out.println("Tu nombre es " + employeeName);

    }
}

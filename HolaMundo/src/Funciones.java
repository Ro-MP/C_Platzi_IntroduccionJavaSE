public class Funciones {
    public static void main(String[] args) {

        double y = 3;

        double areaCirculo = circleArea(y);
        System.out.println("El área del circulo es: " + areaCirculo);
        System.out.println("El área de la efera es: " + sphereArea(y));
        System.out.println(" ");

        System.out.println("PESOS A DOLARES: " + convertToDolar(100, "MXN"));
        System.out.println("COP A DOLARES: " + convertToDolar(10000, "COP"));

        Math
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    /**
     * Description: Función que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada a dolares
     */
    public static double convertToDolar(double quantity, String currency){
        //MXN o COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.049;
                break;
            case "COP":
                quantity = quantity * 0.00023;

        }
        return quantity;
    }
}

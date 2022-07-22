public class Arrays {
    public static void main(String[] args) {

        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String[][] cities = new String[4][2];

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[4][4][4][4];

        //  Asignacion de datos
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        // Impresion con FOR
        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        System.out.println();

        // Impresión con For Each
        for (String androidVersion: androidVersions) {
            System.out.println(androidVersion);
        }
        
        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México  ";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México  ";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.print(cities[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();

        for (String[] pair : cities) {
            for (String city : pair) {
                System.out.print(city + " ");
            }
            System.out.println();
        }
    }
}

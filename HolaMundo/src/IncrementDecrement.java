public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives -1;
        System.out.println(lives);  //4

        // Postfijo
        lives--;  // Op Decremento
        System.out.println(lives);  //3
        lives++;  // Op Incremento
        System.out.println(lives);  //4

        // Prefijo
        // Gana un regalo por ganar una vida
        int gift = 100 + ++lives; // Primero incrementa lives a 5 y despues suma
        System.out.println(gift);
    }

}

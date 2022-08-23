package enumEjercicio;

public class enumerations {
    public enum Palabras {
        ALEGRIA("Joy", "Freude"),
        TRISTEZA("Sadness", "Traurigkeit");

        private String english, deutch;
        private Palabras(String english, String deutch){
            this.english = english;
            this.deutch = deutch;
        }

        public String getEnglish() {
            return english;
        }

        public String getDeutch() {
            return deutch;
        }
    }
}


class PrincipalEnumerations {
    public static void main(String[] args) {

        System.out.println(enumerations.Palabras.ALEGRIA);
        System.out.println(enumerations.Palabras.ALEGRIA.getEnglish());
        System.out.println(enumerations.Palabras.ALEGRIA.getDeutch());

    }
}
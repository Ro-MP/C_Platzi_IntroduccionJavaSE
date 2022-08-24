package enumEjercicio;

public class enumerations {
    public enum Palabras {
        ALEGRIA("Joy", "Freude"),
        TRISTEZA("Sadness", "Traurigkeit");

        final private String english, deutch;
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

enum Dias {
    LUNES, MARTES, MIERCOLES, JUEVE, VIERNES, SABADO, DOMINGO;
}


class PrincipalEnumerations {
    public static void main(String[] args) {

        System.out.println(enumerations.Palabras.ALEGRIA);
        System.out.println(enumerations.Palabras.ALEGRIA.getEnglish());
        System.out.println(enumerations.Palabras.ALEGRIA.getDeutch());

        System.out.println();
        System.out.println(Dias.LUNES);

    }
}
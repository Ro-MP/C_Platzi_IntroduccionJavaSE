public class Doctor {
    private static int idSiguiente = 1;
    int id;  // Autoincrement
    String name;
    String email;
    String speciality;

    // Comportamientos

    Doctor(){
        System.out.println("Construyendo el objeto de Doctor");
        asignId();
    }

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        asignId();
    }

    public void showName(){
        System.out.println(name);
        System.out.println();
    }

    public void showId(){
        System.out.println("ID: " + this.id);
    }

    private void asignId(){
        this.id = idSiguiente;
        idSiguiente++;
    }
}

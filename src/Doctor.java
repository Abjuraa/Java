public class Doctor {
    //Atributos
    static int id = 0;
    String name;
    String speciality;
    Doctor (){
        System.out.println("Se esta construyendo el objeto Doctor");
        id++;
    }
    //Metodos
    public void showName(){
        System.out.println("El nombre del doctor es: " + name);
    }

    public void showId(){
        System.out.println("El id del doctor es: " + id);
    }
}

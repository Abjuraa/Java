public class Doctor {
    //Atributos
    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        System.out.println("Se esta construyendo el objeto Doctor");
        id++;
    }

    Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        this.showName();
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality() {
        this.speciality = speciality;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public int getId() {
        return id;
    }


    //Metodos
    public void showName() {
        System.out.println("El nombre del doctor es: " + this.name);
    }

    public void showSpeciality() {
        System.out.println("La especialidad del doctor es: " + this.speciality);
    }

    public void showId() {
        System.out.println("El id del doctor es: " + id);
    }

    //Creacion

    @Override
    public String toString() {
        return new StringBuilder().append("El doctor es ").append(this.name).append("y se especializa en ").append(this.speciality).toString();
    }
}

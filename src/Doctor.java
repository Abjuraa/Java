public class Doctor {
    //Atributos
    static int id = 0;
    String name;
    String speciality;

    Doctor() {
    }

    Doctor(String name, String speciality) {
        setName(name);
        setSpeciality(speciality);
        id++;
        this.showName();
        this.showSpeciality();
        this.showId();
        System.out.println("-------------------------");
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

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
        return new StringBuilder().append("El doctor es ").append(this.name).append(" y se especializa en ").append(this.speciality).toString();
    }


}

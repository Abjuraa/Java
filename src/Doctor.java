import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    private static int id = 0;
    private String name;
    private String speciality;

    Doctor(String name, String speciality) {
        setName(name);
        setSpeciality(speciality);
        id++;
        this.showName();
        this.showSpeciality();
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

    //Lista que guarda objetos de tipo AvailableAppointment
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //Metodo que agrega una nueva cita a la lista de citas
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    //Devuelve la lista completa de citas disponibles
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            setDate(date);
            setTime(time);
        }

        //Getters
        public Date getDate() {
            return this.date;
        }

        public String getTime() {
            return this.time;
        }

        //Setters
        public void setDate(Date date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}

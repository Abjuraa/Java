import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Bryam", "Optometria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "5am");

        //Trae todas las citas en la clase Doctor y solo trae las citas que le pertenecen a myDoctor
        for (Doctor.AvailableAppointment citas : myDoctor.getAvailableAppointments()) {
            System.out.println(citas.getDate() + " " + citas.getTime());
        }
        System.out.println(myDoctor);

        Patient myPatient = new Patient("leonel", "messi@gmail.com");
        myPatient.setPhoneNumber("3182626850");
        myPatient.setWeight(51.3);
        System.out.println(myPatient.getWeight());
        System.out.println(myPatient.getPhoneNumber());
        //showMenu();*/
    }
}
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Bryam", "Optometria");
        System.out.println(myDoctor);

        Patient myPatient = new Patient("leonel", "messi@gmail.com");
        myPatient.setPhoneNumber("3182626850");
        myPatient.setWeight(51.3);
        System.out.println(myPatient.getWeight());
        System.out.println(myPatient.getPhoneNumber());
        //showMenu();
    }
}
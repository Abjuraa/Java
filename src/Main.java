import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.showId();
        myDoctor.setName("Juan Ricardo");
        myDoctor.showName();

        Doctor urDoctor = new Doctor();
        urDoctor.showId();
        urDoctor.setName("Bryam castañeda");
        urDoctor.showName();

        showMenu();
    }
}
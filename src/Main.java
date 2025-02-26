import static ui.UIMenu.*;

public class Main {
  public static void main(String[] args) {
    Doctor myDoctor = new Doctor();
    myDoctor.name = "Bryam Castañeda Cuervo";
    myDoctor.showName();
    myDoctor.showId();

    Doctor urDoctor = new Doctor();
    urDoctor.name = "Pepitogrill";
    urDoctor.showName();
    urDoctor.showId();

    showMenu();
  }
}
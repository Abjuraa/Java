package ui;
import java.util.Scanner;

public class UIMenu {
    public static void showMenu() {
        System.out.println("Bienvenido a mis apuntes");
        System.out.println("Ingrese una opción");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch(response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    System.out.println("Paciente");
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("Seleccione un valor correcto");
            }
        } while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("Paciente");
            System.out.println("Ingrese una opción");
            System.out.println("1. Apuntes de libros");
            System.out.println("2. Mis apuntes");
            System.out.println("0. Atras");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch(response) {
                case 1:
                    System.out.println("::Book an appointment");
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while(response != 0);

    }
}

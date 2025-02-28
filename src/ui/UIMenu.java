package ui;

import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

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

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    System.out.println("Paciente");
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("Seleccione un valor correcto");
            }
        } while (response != 0);
    }

    static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1. Fecha citas");
            System.out.println("2. Mis apuntes");
            System.out.println("0. Atras");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Fecha citas");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i + 1) + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::Mis apuntes");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);

    }
}

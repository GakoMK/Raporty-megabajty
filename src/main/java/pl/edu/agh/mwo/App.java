package pl.edu.agh.mwo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String pathToData = args[0];

        boolean isRunning = true;
        Scanner in = new Scanner(System.in);

        while (isRunning) {
            System.out.println("=== Raporty ===");
            System.out.println(pathToData);
            System.out.println("1. Raport roczny (ogólny)");
            System.out.println("2. Raport - Liczba godzin wypracowanych per projekt");
            System.out.println("3. Raport - szczegółowy wykaz pracy pracownika");
            System.out.println("4. Raport - procentowe zaangażowanie w projekty");
            System.out.println("5. Raport - top 10 aktywności");
            System.out.println("0 - wyjscie");

            System.out.print(">>>");
            int input = in.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Raport 1");
                    System.out.print("Podaj rok: ");
                    input = in.nextInt();
                    System.out.println("rok: " + input);
                    System.out.println("1. Wyświetl zawartość\n2. Wyeksportuj do Excela");

                    break;
                case 2:
                    System.out.println("Raport 2");
                    break;
                case 3:
                    System.out.println("Raport 3");
                    break;
                case 4:
                    System.out.println("Raport 4");
                    break;
                case 5:
                    System.out.println("Raport 5");
                    break;
            }

            if (input == 0) {
                isRunning = false;
            }
        }
    }
}
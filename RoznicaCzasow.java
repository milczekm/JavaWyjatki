package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;
import wyj¹tki.Zegar;

public class RoznicaCzasow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "cp1250");

        try {
            System.out.println("Podaj pierwszy czas.");

            System.out.print("Podaj godzinê: ");
            int g1 = scanner.nextInt();
            System.out.print("Podaj minutê: ");
            int m1 = scanner.nextInt();

            Zegar z1 = new Zegar(g1, m1);

            System.out.println("Podaj drugi czas.");

            System.out.print("Podaj godzinê: ");
            int g2 = scanner.nextInt();
            System.out.print("Podaj minutê: ");
            int m2 = scanner.nextInt();

            Zegar z2 = new Zegar(g2, m2);

            System.out.println("Pierwsza godzina to: " + z1);
            System.out.println("Druga godzina to: " + z2);

            System.out.println("Ró¿nica czastu to: " + z1.roznicaCzasu(z2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny format.");
        }
    }

}

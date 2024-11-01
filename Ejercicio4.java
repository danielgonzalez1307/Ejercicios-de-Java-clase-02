package SaludoPersonal;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Introduzca la palabra 1: ");
        var palabra1 = scanner.nextLine();

        System.out.print("Introduzca la palabra 2: ");
        var palabra2 = scanner.nextLine();

        System.out.print("Introduzca la palabra 3: ");
        var palabra3 = scanner.nextLine();

        System.out.println(palabra1 + " " + palabra2 + " " + palabra3);

        scanner.close();
    }
}

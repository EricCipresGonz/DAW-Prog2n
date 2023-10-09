package EjerciciosCadenas;

import java.util.Scanner;

public class EX_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pon tu contraseña: ");
        String contraseña = scanner.nextLine();

        boolean esFuerte = esContraseñaFuerte(contraseña);

        if (esFuerte) {
            System.out.println("La contraseña es fuerte.");
        } else {
            System.out.println("La contraseña es débil.");
        }
    }

    public static boolean esContraseñaFuerte(String contraseña) {
        if (contraseña.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneSimbolo = false;
        boolean tieneDigito = false;

        for (char caracter : contraseña.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(caracter)) {
                tieneDigito = true;
            } else {
                tieneSimbolo = true;
            }
        }

        return tieneMayuscula && tieneMinuscula && tieneSimbolo && tieneDigito;
    }
}
    


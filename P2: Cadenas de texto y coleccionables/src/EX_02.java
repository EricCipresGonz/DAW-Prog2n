package EjerciciosCadenas;

import java.util.Scanner;

public class EX_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pon la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Pon la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        String resultado = juntar(cadena1, cadena2);
        System.out.println("Resultado: " + resultado);
    }

    public static String juntar(String cadena1, String cadena2) {
        StringBuilder resultado = new StringBuilder();
        int longitud = Math.max(cadena1.length(), cadena2.length());

        for (int i = 0; i < longitud; i++) {
            if (i < cadena1.length() && cadena1.charAt(i) != ' ') {
                resultado.append(cadena1.charAt(i));
            }

            if (i < cadena2.length() && cadena2.charAt(i) != ' ') {
                resultado.append(cadena2.charAt(i));
            }
        }

        return resultado.toString();
    }
}


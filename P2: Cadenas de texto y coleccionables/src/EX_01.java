package EjerciciosCadenas;

import java.util.Scanner;

public class EX_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pon el nombre y apellidos: ");
        String nombreCompleto = scanner.nextLine();

        String formato = obtener(nombreCompleto);
        System.out.println("Resultado: " + formato);
    }

    public static String obtener(String nombreCompleto) {
        String[] nombresApellidos = nombreCompleto.split(" ");

        if (nombresApellidos.length < 2) {
            return "No válido";
        }

        String iniciales = "";
        for (int i = 0; i < nombresApellidos.length - 1; i++) {
            String nombre = nombresApellidos[i];
            if (!nombre.isEmpty()) {
                iniciales += nombre.charAt(0) + ". ";
            }
        }

        String apellidos = nombresApellidos[nombresApellidos.length - 1];
        return apellidos + ", " + iniciales.trim();
    }
}
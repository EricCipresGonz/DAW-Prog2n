package Excepciones_y_herencia.EX_04;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CuadradoNumero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean esNumeroValido = false;
        int numeroIngresado = 0;

        while (!esNumeroValido) {
            try {
                System.out.print("Ingresa un número entero: ");
                numeroIngresado = lector.nextInt();
                esNumeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero válido.");
                lector.nextLine();
            }
        }

        int cuadrado = numeroIngresado * numeroIngresado;
        System.out.println("El cuadrado de " + numeroIngresado + " es " + cuadrado);
        lector.close();
    }
}

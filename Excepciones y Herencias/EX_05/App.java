package Excepciones_y_herencia.EX_05;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        try {
            System.out.print("Introduce la cantidad de números: ");
            int cantidadNumeros = Integer.parseInt(lector.nextLine());

            if (cantidadNumeros <= 0) {
                throw new IllegalArgumentException("La cantidad de números debe ser mayor que cero.");
            }

            double[] arrayNumeros = new double[cantidadNumeros];
            for (int i = 0; i < cantidadNumeros; i++) {
                System.out.print("Introduce el número #" + (i + 1) + ": ");
                arrayNumeros[i] = Double.parseDouble(lector.nextLine());
            }

            double media = calcularMedia(arrayNumeros);
            System.out.println("La media es de : " + media);

        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. ");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error no esperado: " + e.getMessage());
        }

        lector.close();
    }

    public static double calcularMedia(double[] arrayNumeros) {
        if (arrayNumeros.length == 0) {
            throw new ArithmeticException("No se puede calcular la media ");
        }

        double suma = 0.0;
        for (double numero : arrayNumeros) {
            suma += numero;
        }

        return suma / arrayNumeros.length;
    }
}

package EjerciciosCadenas;

import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pon una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Pon un carácter : ");
        char caracterABuscar = scanner.next().charAt(0);

        int[] posiciones = encontrar(frase, caracterABuscar);

        if (posiciones.length == 0) {
            System.out.println("El carácter no esta");
        } else {
            System.out.print("El carácter esta ");
            for (int posicion : posiciones) {
                System.out.print(posicion + " ");
            }
            System.out.println();
        }
    }

    public static int[] encontrar(String frase, char caracter) {
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                count++;
            }
        }

        int[] posiciones = new int[count];
        int index = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                posiciones[index] = i;
                index++;
            }
        }

        return posiciones;
    }
}


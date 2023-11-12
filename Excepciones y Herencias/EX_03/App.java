package Excepciones_y_herencia.EX_03;

public class App {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3, 4, 5};
            int indiceInvalido = 6; 
            int valor = obtenerValor(numeros, indiceInvalido);
            System.out.println("El valor es: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha capturado una ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    private static int obtenerValor(int[] array, int indice) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de los límites del array");
        }
        return array[indice];

    }
}
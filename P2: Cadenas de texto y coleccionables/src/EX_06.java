package EjerciciosCadenas;

public class EX_06 {
    public static void main(String[] args) {
        String cadena = "Cadenas de texto y coleccionables";

        System.out.println("Caracteres de la cadena y su representación ASCII:");
        for (char caracter : cadena.toCharArray()) {
            int asciiValue = (int) caracter;
            System.out.println("ASCII: " + asciiValue + " es equivalente a: " + caracter);
        }
    }
}

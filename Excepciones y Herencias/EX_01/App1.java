package Excepciones_y_herencia.EX_01;

public class App1 {
    public static void main(String[] args) {
        try {
            int num = -2;
            if (num < 0) {
                throw new App("Es negativo: " + num);
            }
        } catch (App e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}




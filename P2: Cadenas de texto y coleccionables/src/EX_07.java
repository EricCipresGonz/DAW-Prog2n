package EjerciciosCadenas;

import java.util.ArrayList;

import java.util.Iterator;

public class EX_07 {
    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Obtener un Iterator para el ArrayList
        Iterator<Integer> iterator = numeros.iterator();

        // Iterar y mostrar los elementos del ArrayList
        System.out.println("Elementos del ArrayList:");
        while (iterator.hasNext()) {
            Integer elemento = iterator.next();
            System.out.println(elemento);
        }
    }}
package EjerciciosCadenas;

import java.util.ArrayList;
import java.util.List;

public class EX_09 {
    public static void main(String[]args){
        List<String> l = new ArrayList<>();
        l.add("TerStegen");
        l.add("Lewandoski");
        l.add("Pedri");
        l.add("Raphina");


        String[] a =l.toArray(new String[0]);

        for (String barça : a){
            System.out.println(barça);
        }
    }}
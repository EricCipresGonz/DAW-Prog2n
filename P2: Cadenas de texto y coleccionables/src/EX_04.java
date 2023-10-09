package EjerciciosCadenas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Pon una frase: ");
    String f= scanner.nextLine();


    System.out.println("Pon un Caracter");
    char c= scanner.next().charAt(0);
    List<Integer> p = new ArrayList<>();
    int i= f.indexOf(c);

    while(i !=-1){
        p.add(i);
        i= f.indexOf(c,i+i);
    }
    if(!p.isEmpty()){
        System.out.println("El caracter "+c+ "no esta");
        for(int pos : p){
            System.out.println(p +"");

        }
     } else{
            System.out.println("El caracter"+c+"esta");
        }
    }


}

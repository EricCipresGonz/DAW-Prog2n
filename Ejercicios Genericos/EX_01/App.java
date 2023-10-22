package Genericos.EX_01;

public class App {
    private static String string;
    private static String M;


    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.add(5);
        s.add(10);
        s.add(15);


        string = s.toString();
        System.out.println("Stack: " + string);
        System.out.println("Elemento: " + s.getFirst());
        System.out.println("Eliminar el primero: " + s.removeFirst());
        M = s.toString();
        System.out.println("Stack al eliminar el primer elemento "+ M);
    }
    
}

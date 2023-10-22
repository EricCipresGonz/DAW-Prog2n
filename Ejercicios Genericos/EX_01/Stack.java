package Genericos.EX_01;

import java.util.LinkedList;

public class Stack <T> {
    private LinkedList<T> l;

    public Stack(){
        l = new LinkedList<>();
    }

    public boolean isEmpty(){
        return l.isEmpty();

    }
    public T removeFirst(){
        if(isEmpty()){
            System.out.println("Esta vacio");
        }
        return l.removeFirst();

    }
    public T getFirst(){
        if(isEmpty()){
            System.out.println("Esta vacio");
        }
        return l.getFirst();
    }
    public void add(T element){
        l.addFirst(element);
    }
    public String toString(){
        return l.toString();
    }
}
    


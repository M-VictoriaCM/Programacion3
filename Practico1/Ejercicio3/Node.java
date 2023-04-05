package Ejercicio3;

public class Node <T>{
    private T info;
    private Node<T> next;

    //Constructor
    public Node(){
        this.info = null;
        this.next= null;
    }
    //Constructor
    public Node(T info, Node<T> next){
        this.setInfo(info);//nodo
        this.setNext(next);//siguiente
    }
    //Getter y setter
    public T getInfo(){
        return this.info;
    }
    public void setInfo(T info){
        this.info=info;
    }
    public Node<T> getNext(){
        return this.next;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }
}

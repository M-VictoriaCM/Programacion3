package Ejercicio3;



public class Pila<T> extends MySimpleLinkedList<T>  {

    public Pila() {
        super();

    }
    public void push(T info){
        this.insertFront(info);
    }
    public T pop(){
        return this.extractFront();
    }
    public  T top(){
        if(this.isEmpty()){
            return null;
        }else{
            return first.getInfo();
        }
    }
    public void reverse(){
        Pila<T>tmp = new  Pila<T>();
        while(this.size()>0){
            tmp.insertFront(this.extractFront());
            this.first= tmp.first;
        }

    }
    public String toString(){
        String pila=" ";
        Node<T>tmp = this.first;
        while(tmp != null){
            pila += tmp.getInfo().toString();
            if(tmp.getNext() != null){
                pila += " -> ";
            }
            tmp = tmp.getNext();

        }
        return pila;
    }
}

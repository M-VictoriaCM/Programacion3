package Ejercicio5;

import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T>{
    private Node<T> first;
    private int size;
    private Node<T>cursor;

    public MySimpleLinkedList(){
        this.first=null;
        this.size = 0;
        this.cursor=null;
    }
    //Metodos
    public void insertFront(T info){//Insertar en la primera posicion
        Node<T> tmp = new Node<T>(info, null);
        tmp.setNext(this.first);
        this.first = tmp;
        this.size++;
    }
    public T extractFront(){ //Elimina el primer elemento ingresado
        T tmp = this.first.getInfo();
        this.first = this.first.getNext();
        this.size--;
        return tmp;
    }
    public int size(){//Tamaño de la lista
        return this.size;
    }
    public T get(int index){ //muestra que informacion hay dentro del nodo
        if((-1 < index) && (index < size)){
            int contador=0;
            Node<T> cursor = first;
            while(contador<index){
                cursor = cursor.getNext();
                contador++;
            }
            return cursor.getInfo();
        }else{
            return null;
        }
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public int getIndexOf(T info) {
        int posicion =0;
        Node<T> tmp = this.first;
        while(tmp != null){
            if(tmp.getInfo() == info){
                return posicion;
            }
            posicion ++;
            tmp = tmp.getNext();
        }
        return -1;
    }
    @Override
    public String toString(){
        String lista ="";
        Node<T> tmp = this.first;
        while(tmp != null){
            lista += tmp.getInfo().toString();
            if(tmp.getNext() != null){
                lista += "->";
            }
            tmp= tmp.getNext();
        }
        return lista;
    }
    public void iniciarCursor(){//Comienza en el primero
        this.cursor= this.first;//O(1)
    }
    public T getInfoCursor(){//Muestra la informacion del nodo, donde esta parado
        return this.cursor.getInfo();
    }
    public void avanzarCursor(){//se mueve al siguiente
        this.cursor= this.cursor.getNext();
    }
    public boolean cursorLlegoAlFinal(){
        return this.cursor == null;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this.first);
    }
}


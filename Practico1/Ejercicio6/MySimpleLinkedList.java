package Ejercicio6;

public class MySimpleLinkedList<T> {
    private Node<T> first;
    private int size;
    private Node<T> cursor;

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
            int contador =0;
            Node<T>cursor = first;
            while(contador < index){
                cursor.getNext();
                contador ++;
            }
            return cursor.getInfo();
        }
        return null;
    }
    /*public void insertInOrden(T info){
        if(Comparable<T>) info.compareTo(first.getInfo()) == -1){

        }
    }*/
    public boolean isEmpty() {
        return this.first == null;
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

}

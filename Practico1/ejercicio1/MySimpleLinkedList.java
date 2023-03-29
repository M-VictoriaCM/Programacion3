package Ejercicio1;

public class MySimpleLinkedList<T>{
   private Node<T> first;
    private int _size;

    public MySimpleLinkedList() {
        this.first = null;
        this._size= 0;
    }

    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
        _size++;
    }

    /*public T extractFront() {
        Node<T>tmp=first;
        while(tmp !=null){
            
        }
    }*/

    public boolean isEmpty() {//sino esta vacia
        return this.first == null;
    }
    
    public T get(int index) {
        int i=0;
        if(index < size()){
            Node<T>tmp= first;
            while( i< index){
                tmp = tmp.getNext();
                i++;
            }
            return tmp.getInfo();
                
        }return null;
    }

    public int size() {
        return _size;
        /*Node<T>tmp= first;
        int contador=0;
        while(tmp != null){
            contador ++;
            tmp = tmp.getNext();
        }
        return contador;*/
    }

    @Override
    /*public String toString() {
        return "MySimpleLinkedList{" +
                "first=" + first +
                ", _size=" + _size +
                '}';
    }*/
    public String toString(){
        Node<T> tmp =this.first;
        String lista = "";
            while(tmp !=null){ 
                lista = lista + tmp.getInfo().toString();
                tmp=tmp.getNext();
            }
        return lista;
    }
}

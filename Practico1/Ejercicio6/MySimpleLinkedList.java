package Ejercicio6;

public class MySimpleLinkedList<T>{
    protected Node<T> first;
    protected int size;
    protected Node<T> cursor;


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
        int contador=0;
        if(index < this.size){
            Node<T> tmp = this.first;
            while(contador < index){
                tmp =tmp.getNext();
                contador++;
            }
            return tmp.getInfo();
        }else{
            return null;
        }
    }
    public boolean isEmpty() {
        return this.first == null;
    }

    public void iniciarCursor(){
        this.cursor= this.first;//O(1)
    }
    public T getInfoCursor(){
        return this.cursor.getInfo();
    }
    public void avanzarCursor(){
        this.cursor= this.cursor.getNext();
    }
    public boolean cursorLlegoAlFinal(){
        return this.cursor == null;
    }

  public MySimpleLinkedList<T> ordenar(MySimpleLinkedList<T> lista){
        MySimpleLinkedList<T> listaAux= new MySimpleLinkedList<>();
        if(!this.isEmpty()){
            if(!lista.isEmpty()){
                Node<T> ele= this.first;
                while (ele!=null){
                    Node<T> ele2= lista.first;
                    while (ele2!=null){
                        if(ele.compareTo(ele2)==0){
                            listaAux.insertFront(ele.getInfo());
                        }
                        ele2=ele2.getNext();
                    }
                    ele=ele.getNext();
                }

            }
        }

        return listaAux;
  }
    @Override
    public String toString(){
        String lista ="";
        Node<T> tmp = this.first;
        while(tmp != null){
            lista = lista + tmp.getInfo().toString();
            if(tmp.getNext() != null){
                lista = lista +"->";
            }
            tmp= tmp.getNext();
        }
        return lista;
    }

}


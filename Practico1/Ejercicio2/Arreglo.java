package Ejercicio2;

public class Arreglo {
    private int[] arreglo;
    private int numero;
    private int size;

    public Arreglo() {
        this.numero = 10;//numero que ingresa en la posicion del arreglo
        this.size = 0; //tamaño del arreglo
        this.arreglo = new  int[numero];
    }

    public int getSize() {
        return size;
    }

    public int getNumero(){
        return numero;
    }


    public void add(int i) {
        if(size == arreglo.length){
           System.out.println("Esta lleno");
		   
        }
        arreglo[size]=i;
        size++;
    }


    public void imprimirArreglo() {
        for(int i=0; i<size; i++){
            System.out.print(arreglo[i]+" | ");

        }
        System.out.println(" ");
    }

    public void insertarPrimeraPosicion(int numero) {
        correrDerecha();
        arreglo[0]= numero;
    }

    private void correrDerecha() {
        for(int i=size-1; i>0; i--){
            arreglo[i] = arreglo[i-1];
        }
    }

    public int buscarPorPosicion(int elementoBuscado) {
        for(int i=0;i< arreglo.length; i++){
            if(arreglo[i]== elementoBuscado){
                return i;
            }
        }
        return -1;
    }
}

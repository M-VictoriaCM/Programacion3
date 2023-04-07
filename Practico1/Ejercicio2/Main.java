package Ejercicio2;

public class Main {
    public static void main(String[]args){
        Arreglo array = new Arreglo();
        array.add(2);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(1);

        int numero = array.getNumero();

        System.out.println("Arreglo original");
        array.imprimirArreglo();
        //1- 
       array.insertarPrimeraPosicion(numero);
        array.imprimirArreglo();
        //2
        int posicion= array.buscarPorPosicion(8);
        System.out.println("El elemento se encontro en la posicion "+posicion);
        //3-
        int longitud =array.getSize();
        System.out.println("El tamaño del arreglo es "+longitud);
    }
}

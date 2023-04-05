package Ejercicio2;

public class Arreglo {
    final int max = 5;
    int [] arreglo={2,6,8,7,1};
    int numero=10, buscado=1;

    public void reolver() {
        imprimirArreglo(arreglo);
        insertar(numero, arreglo);
        imprimirArreglo(arreglo);
        int encontrado=buscarPorPosicion(arreglo, buscado);
        System.out.println(encontrado);

        int cantidad = arreglo.length;
        System.out.println("El arreglo tiene "+cantidad);
    }

    private int buscarPorPosicion(int[] arreglo,int posicion) {
        if(posicion >=0  && posicion < max){
            return  arreglo[posicion];
        }
        else{
            return -1;
        }
    }
    private void imprimirArreglo(int[] arreglo) {
        for(int i=0; i<max; i++){
            System.out.print (arreglo[i]+" | ");
        }
        System.out.println("");
    }

    public void insertar(int numero, int[]arreglo){
        correrDerecha(arreglo);
        arreglo[0]=numero;
    }
    public void correrDerecha(int []arreglo){
        for(int i=(max-1); i>0; i--){
            arreglo[i]= arreglo[i-1];
        }
    }
}

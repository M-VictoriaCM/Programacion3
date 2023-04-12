package Practico2;

public class Ejercicio2 {

    public int ordenarAscendente(int[] arreglo, int elemento, int inferior, int superior) {
        while(inferior <= superior){
            int medio = (inferior + superior)/2;
            if(arreglo[medio] == elemento){
                return medio;
            }else if(arreglo[medio]> elemento){
                return ordenarAscendente(arreglo, elemento ,inferior, medio-1);
            }else{
                return ordenarAscendente(arreglo, elemento, medio+1, superior) ;
            }
        }
        return -1;
    }

}

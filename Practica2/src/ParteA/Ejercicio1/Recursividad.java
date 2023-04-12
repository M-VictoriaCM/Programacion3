package Ejercicio1;

public class Recursividad {
    public boolean estaOrdenado(int[] arreglo, int pos) {
        if ((arreglo.length > pos+1) && (arreglo.length>0)) {
            if (arreglo[pos] <= arreglo[pos + 1]) {
                return estaOrdenado(arreglo, pos + 1);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}

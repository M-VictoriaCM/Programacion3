package Ejercicio1;

public class Recursividad {
    public boolean estaOrdenado(int[] arreglo, int pos) {
        if (pos < 1) {
            return true;
        } else if (arreglo[pos] < arreglo[pos - 1]) {
            return false;
        } else {
            return estaOrdenado(arreglo, pos- 1);
        }
    }
}

package Ejercicio1;

public class Main {
    public static void main(String[]args) {
        Recursividad re = new Recursividad();
        int[] arreglo = {1, 2, 3, 4, 5};
        int[] arreglo1 = {10, 5, 13, 1, 5};

        System.out.println(re.estaOrdenado(arreglo, arreglo.length-1));
        System.out.println(re.estaOrdenado(arreglo1, arreglo1.length-1));
    }
}

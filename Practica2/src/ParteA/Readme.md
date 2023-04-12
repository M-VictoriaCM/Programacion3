Ejercicio 3:
public class Main {
    public static void main(String[] args) {
        int numero= 26;

        ConversorBinario c= new ConversorBinario();

        c.convertir(numero);
    }
}
public class ConversorBinario {
    public void convertir(int numero) {
        int resto=0;

        if(numero!=0){
            resto=numero%2;
            System.out.print(resto);
            numero= numero/2;
            convertir(numero);
        }
    }
}

---------------------------------------------------------------------------------------------------------
Ejercicio5
public class Main {
    public static void main(String[] args) {
        int[] arreglo1 = {10, 5, 13, 1, 4,16,5,8,10,9};
        Buscar b = new Buscar();
        b.coincidencias(arreglo1,0);
        
    }
}
public class Buscar {
    public void coincidencias(int[] arr, int pos) {
        if(pos<arr.length){
            System.out.println(pos);
            if (arr[pos]==pos) {
                System.out.println("El numero: "+arr[pos]+" es igual a: "+pos);
                coincidencias(arr,pos+1);
            }
            else {
                coincidencias(arr,pos+1);
            }
        }
    }


}


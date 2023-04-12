package Ejercicio5;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<Integer>();
        lista.insertFront(2);
        lista.insertFront(6);
        lista.insertFront(8);
        lista.insertFront(7);
        lista.insertFront(1);
        /*for(int i =0; i<lista.size(); i++){//O(n*n)
			System.out.println(lista.get(indez)); //O(n)
		}*/
//El get esta pensado para un acceso aleatorio, no un acceso secuencial

		/*lista.iniciarCursor();//O(1)
		//for(int i =0; i<lista.size(); i++){
		while(!lista.cursorLlegoAlFinal()){//O(n)
			System.out.println(lista.getInfoCursor());//O(1)
			lista.avanzarCursor();//O(1)
		}*/
        Iterator<Integer>it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}

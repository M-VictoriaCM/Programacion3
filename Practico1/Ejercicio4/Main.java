package Ejercicio4;

public class Main {
	public static void main(String[] args) {
		MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<Integer>();
		lista.insertFront(2);
		lista.insertFront(6);
		lista.insertFront(8);
		lista.insertFront(7);
		lista.insertFront(1);

		System.out.println(lista.isEmpty());
		System.out.println(lista.size());
		lista.extractFront();

		System.out.println(lista.toString());

        System.out.print("La lista tiene una longitud de : ");
		System.out.println(lista.size());

		System.out.print("Elemento se encuentra en la posicion: ");
		int indice =lista.getIndexOf(7);
		System.out.println(indice);

	}


}


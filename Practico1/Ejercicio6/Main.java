package Ejercicio6;

public class Main{
	public static void main(String[] args){
		MySimpleLinkedList<Integer> lista1 = new MySimpleLinkedList<Integer>();
        	MySimpleLinkedList<Integer> lista2 = new MySimpleLinkedList<Integer>();
        	MySimpleLinkedList<Integer> lista3= new MySimpleLinkedList<Integer>();
		lista1.insertFront(2);
		lista1.insertFront(6);
		lista1.insertFront(8);
		lista1.insertFront(7);
		lista1.insertFront(1);



		lista2.insertFront(2);
		lista2.insertFront(89);
		lista2.insertFront(7);
		lista2.insertFront(10);
		lista2.insertFront(1);


		lista3=lista1.ordenar(lista2);
		System.out.println(lista3.toString());
	    }

}

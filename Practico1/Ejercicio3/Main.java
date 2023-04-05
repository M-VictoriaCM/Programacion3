package Ejercicio3;

public class Main {
    public static void main(String[] args){
        Pila<Integer> myPila = new Pila<Integer>();
        myPila.insertFront(2);
        myPila.insertFront(6);
        myPila.insertFront(8);
        myPila.insertFront(7);
        myPila.insertFront(1);

        System.out.println(myPila.toString());
        //System.out.println(myPila.top());
        //myPila.pop();
        //System.out.println(myPila.toString());
        myPila.reverse();
        System.out.println(myPila.toString());

		/*lista.extractFront();

		System.out.println(lista.toString());
		System.out.println(lista.size());*/


    }
}

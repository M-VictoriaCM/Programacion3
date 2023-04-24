package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        TreeWithNode a = new TreeWithNode();
        a.insert(15);
        a.insert(6);
        a.insert(18);
        a.insert(3);
        a.insert(7);
        a.insert(17);
        a.insert(20);
        a.insert(2);
        a.insert(4);
        a.insert(13);
        a.insert(9);

        System.out.print("PreOrden ");
        a.printPreOrden(); //PreOrden 15 6 3 2 4 7 13 9 18 17 20
        System.out.println("");

        System.out.print("PosOrden ");
        a.printPosOrden(); //PosOrden 2 4 3 9 13 7 6 17 20 18 15
        System.out.println("");

        System.out.print("InOrden ");
        a.printInOrden(); //InOrden 2 3 4 6 7 9 13 15 17 18 20
        System.out.println("");




    }


}

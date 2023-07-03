
package Ejercicio3;

import Ejercicio2.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GrafoDirigido<String> grafo = new GrafoDirigido<>();
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);
        grafo.agregarVertice(6);

        // Agregar las aristas para formar un ciclo
        grafo.agregarArco(1, 2, "e");
        grafo.agregarArco(2, 3, "a");
        grafo.agregarArco(3, 4,"b");
        grafo.agregarArco(4, 5,"c");
        grafo.agregarArco(5, 6, "d");
        grafo.agregarArco(6, 1, "a");
        
        System.out.println("Grafo" + grafo.toString());
        TieneCiclo ciclo=new TieneCiclo(grafo);
        System.out.println(ciclo.buscarCiclo());
        
        
        
//        DFS dfs= new DFS(grafo);
//        List<Integer> resultadoDFS = dfs.dfsForest();
//        System.out.println("DFS: " + resultadoDFS );
        
        
    }
    
}

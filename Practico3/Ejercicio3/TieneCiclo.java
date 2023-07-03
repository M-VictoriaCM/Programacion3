
package Ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TieneCiclo {
    private Grafo<?>grafo;
    private Set<Integer>visitado;
    private HashMap<Integer, String>colores;
    private boolean encontrado;
    
    public TieneCiclo(Grafo<?>grafo){
        this.grafo=grafo;
        this.colores = new HashMap<>();
        this.encontrado =false;
        this.visitado = new HashSet<>();
    }
    
    public boolean buscarCiclo(){
        Iterator<Integer>iteratorVertice= grafo.obtenerVertices();
        while(iteratorVertice.hasNext()){
            int verticeId = iteratorVertice.next();
            this.colores.put(verticeId, "Blanco"); 
        }
        while(iteratorVertice.hasNext()){
            int v= iteratorVertice.next();
            if(colores.get(v).equals("Blanco")){
                if(buscarCiclo(v)){
                    return true;
                } 
            }
        }
        return encontrado;
    }

    private boolean buscarCiclo(int v) {
        visitado.add(v);
        colores.replace(v, "Gris");
        Iterator<Integer>adyacentes = grafo.obtenerAdyacentes(v);
        while(adyacentes.hasNext()){
            int siguiente= adyacentes.next();
            if(visitado.contains(siguiente) && colores.get(siguiente).equals("Gris")){
                    System.out.println("ciclo encontrado");
                    encontrado = true;
                    return true;
            }else if(!visitado.contains(siguiente) && buscarCiclo(siguiente)){
                return true;
            }
        }
        colores.replace(v, "Negro");
        return false;
    }   
}

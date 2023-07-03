
package Ejercicio9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CaminosAlternativos {
    private Grafo<?>grafo;
    private Set<String>visitado;
    private List<HashMap<Integer, String>>caminos;

    public CaminosAlternativos(Grafo<?> grafo) {
        this.grafo = grafo;
        this.visitado = visitado;
        this.caminos = caminos;
    }
    public List<HashMap<Integer, String>>EncotrarCaminosAlternativos(String origen, String destino){
        HashMap<Integer, String>caminoActual = new HashMap<>();
        caminoActual.put(0, origen);
        visitado.add(origen);
        caminoAlternativo(origen,destino, caminoActual);
        
        return caminos;
    }

    private void caminoAlternativo(String origen, String destino, HashMap<Integer, String> caminoActual) {
        if(origen.equals(destino)){
            caminos.add(new HashMap<>(caminoActual));
        }else{
            Iterator<String>adyacentes= grafo.obtenerAdyacentes(actual);
            int paso = caminoActual.size();
            while(adyacentes.hasNext()){
                String siguiente = adyacentes.next();
                if(!visitado.contains(siguiente)){
                    if(!(origen.equals("Las Flores") && siguiente.equals("Rauch"))){
                        visitado.add(siguiente);
                        caminoActual.put(paso, siguiente);
                        
                        caminoAlternativo(siguiente, destino, caminoActual);
                        caminoActual.remove(paso);
                        visitado.remove(siguiente);
                                
                    }
                }
            }
        }
              
    }
    
    
    
    
    
}

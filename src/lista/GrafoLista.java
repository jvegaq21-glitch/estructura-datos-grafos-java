package lista;

import java.util.ArrayList;
import java.util.List;

public class GrafoLista {

    private List<List<Integer>> listaAdyacencia;
    private int vertices;

    public GrafoLista(int vertices) {
        this.vertices = vertices;
        listaAdyacencia = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            listaAdyacencia.add(new ArrayList<>());
        }
    }

    public void agregarArista(int origen, int destino) {
        listaAdyacencia.get(origen).add(destino);
        listaAdyacencia.get(destino).add(origen); // grafo no dirigido
    }

    public void mostrarLista() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertice " + i + ": ");
            for (int vecino : listaAdyacencia.get(i)) {
                System.out.print(vecino + " ");
            }
            System.out.println();
        }
    }
}

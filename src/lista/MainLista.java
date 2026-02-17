package lista;

public class MainLista {

    public static void main(String[] args) {

        GrafoLista grafo = new GrafoLista(4);

        grafo.agregarArista(0, 1); //A->B
        grafo.agregarArista(0, 2); //A->C
        grafo.agregarArista(1, 3); //B->D

        grafo.mostrarLista();
    }
}

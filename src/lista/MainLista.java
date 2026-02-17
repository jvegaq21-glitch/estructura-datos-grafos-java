package lista;

public class MainLista {

    public static void main(String[] args) {

        GrafoLista grafo = new GrafoLista(4);

        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);

        grafo.mostrarLista();
    }
}

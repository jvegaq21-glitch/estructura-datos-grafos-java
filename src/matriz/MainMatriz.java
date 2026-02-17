package matriz;

public class MainMatriz {
    public static void main(String[] args) {
        GrafoMatriz grafo = new GrafoMatriz(4);

        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);

        grafo.mostrarMatriz();
    }
}

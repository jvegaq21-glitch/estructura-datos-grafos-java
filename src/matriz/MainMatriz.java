package matriz;

public class MainMatriz {
    public static void main(String[] args) {
        GrafoMatriz grafo = new GrafoMatriz(4);

        grafo.agregarArista(0, 1); //A->B
        grafo.agregarArista(1, 2); //B->C
        grafo.agregarArista(2, 3); //C->D
        grafo.agregarArista(3, 0); //D->A

        grafo.mostrarMatriz();
    }
}

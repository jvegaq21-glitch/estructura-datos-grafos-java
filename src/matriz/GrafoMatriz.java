package matriz;

public class GrafoMatriz {

    private int[][] matriz;
    private int tamaño;

    public GrafoMatriz(int tamaño) {
        this.tamaño = tamaño;
        matriz = new int[tamaño][tamaño];
    }

    public void agregarArista(int origen, int destino) {
        if (origen >= 0 && origen < tamaño &&
            destino >= 0 && destino < tamaño) {

            matriz[origen][destino] = 1;

        } else {
            System.out.println("Error: Uno o ambos vértices no existen.");
        }
    }

    public void mostrarMatriz() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

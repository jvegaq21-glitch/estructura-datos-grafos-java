import java.util.ArrayList;

public class GrafoMatriz {

    private ArrayList<String> vertices;
    private int[][] matriz;
    private int capacidad;

    public GrafoMatriz(int tamaño) {
        capacidad = tamaño;
        vertices = new ArrayList<>();
        matriz = new int[tamaño][tamaño];
    }

    public void agregarVertice(String vertice) {

        if (vertices.contains(vertice)) {
            System.out.println("El vértice " + vertice + " ya existe.");
            return;
        }

        if (vertices.size() >= capacidad) {
            System.out.println("No se pueden agregar más vértices.");
            return;
        }

        vertices.add(vertice);
        System.out.println("Vértice " + vertice + " agregado correctamente.");
    }

    public void agregarArista(String origen, String destino) {

        int i = vertices.indexOf(origen);
        int j = vertices.indexOf(destino);

        if (i == -1 || j == -1) {
            System.out.println("Error: Uno o ambos vértices no existen.");
            return;
        }

        if (matriz[i][j] == 1) {
            System.out.println("La arista ya existe.");
            return;
        }

        matriz[i][j] = 1; // Dirigido
        System.out.println("Arista agregada: " + origen + " -> " + destino);
    }

    public void mostrarMatriz() {

        if (vertices.isEmpty()) {
            System.out.println("El grafo está vacío.");
            return;
        }

        System.out.print("  ");
        for (String v : vertices) {
            System.out.print(v + " ");
        }
        System.out.println();

        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i) + " ");
            for (int j = 0; j < vertices.size(); j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

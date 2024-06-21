import java.util.ArrayList;
import java.util.List;

public class GrafoAdcia {
    private List<VerticeAdyacencia> tablaAdyacencia;

    public GrafoAdcia(int nVertices) {
        tablaAdyacencia = new ArrayList<>(nVertices);
        for (int i = 0; i < nVertices; i++) {
            tablaAdyacencia.add(new VerticeAdyacencia()); // Inicializa con vértices vacíos
        }
    }

    public void nuevoVertice(String nombre) {
        tablaAdyacencia.add(new VerticeAdyacencia(nombre)); // Agrega un nuevo vértice al final
    }

    public void nuevoArco(String base, String finali) {
        int vOrigen = nVertice(base);
        int vDestino = nVertice(finali);
        if (vOrigen != -1 && vDestino != -1) {
            tablaAdyacencia.get(vOrigen).agregarAdyacente(vDestino); // Agrega el arco
        }
    }

    public int nVertice(String nVertice) {
        for (int i = 0; i < tablaAdyacencia.size(); i++) {
            if (tablaAdyacencia.get(i).getNombre() != null && tablaAdyacencia.get(i).getNombre().equals(nVertice)) {
                return i;
            }
        }
        return -1;
    }

    public List<VerticeAdyacencia> getTablaAdyacencia() {
        return tablaAdyacencia;
    }
}
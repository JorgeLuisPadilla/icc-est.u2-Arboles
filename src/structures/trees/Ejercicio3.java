package structures.trees;

import java.util.ArrayList;
import java.util.List;

import structures.node.Node;

// Ejercicio 3: agrupar los nodos del árbol por nivel (recorrido por anchura)
public class Ejercicio3 {

    public List<List<Node<Integer>>> listLevels(Node<Integer> raiz) {
        List<List<Node<Integer>>> niveles = new ArrayList<>();
        agregarPorNivel(raiz, 0, niveles);
        return niveles;
    }

    private void agregarPorNivel(Node<Integer> actual, int nivel, List<List<Node<Integer>>> niveles) {
        if (actual == null) {
            return;
        }
        if (niveles.size() == nivel) {
            niveles.add(new ArrayList<>());
        }
        niveles.get(nivel).add(actual);

        agregarPorNivel(actual.getLeft(), nivel + 1, niveles);
        agregarPorNivel(actual.getRight(), nivel + 1, niveles);
    }

    // Imprime el árbol de arriba hacia abajo, usando los niveles que ya
    // calcula listLevels(). Cada nivel lleva menos sangría que el anterior.
    public void imprimirArbolCentrado(Node<Integer> raiz) {
        List<List<Node<Integer>>> niveles = listLevels(raiz);
        int altura = niveles.size();

        for (int i = 0; i < altura; i++) {
            StringBuilder fila = new StringBuilder();
            for (int espacio = 0; espacio < altura - i; espacio++) {
                fila.append(" ");
            }

            List<Node<Integer>> nivel = niveles.get(i);
            for (int j = 0; j < nivel.size(); j++) {
                fila.append(nivel.get(j).getValue());
                if (j < nivel.size() - 1) {
                    fila.append(" ");
                }
            }

            System.out.println(fila);
        }
    }
}

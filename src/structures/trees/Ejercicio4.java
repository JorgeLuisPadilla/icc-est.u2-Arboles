package structures.trees;
import structures.node.Node;

// Ejercicio 4: calcular la profundidad máxima (altura) del árbol
public class Ejercicio4 {

    public int maxDepth(Node<Integer> raiz) {
        if (raiz == null) {
            return 0;
        }

        int profundidadIzquierda = maxDepth(raiz.getLeft());
        int profundidadDerecha = maxDepth(raiz.getRight());

        return Math.max(profundidadIzquierda, profundidadDerecha) + 1;
    }
}
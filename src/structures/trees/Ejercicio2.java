package structures.trees;
import structures.node.Node;

// Ejercicio 2: invertir un árbol binario (espejo izquierda <-> derecha)
public class Ejercicio2 {

    public Node<Integer> invertTree(Node<Integer> nodoActual) {
        if (nodoActual == null) {
            return null;
        }

        // Intercambiar los hijos del nodo actual
        Node<Integer> hijoIzquierdo = nodoActual.getLeft();
        nodoActual.setLeft(nodoActual.getRight());
        nodoActual.setRight(hijoIzquierdo);

        // Repetir el mismo intercambio en cada subárbol
        invertTree(nodoActual.getLeft());
        invertTree(nodoActual.getRight());

        return nodoActual;
    }
}
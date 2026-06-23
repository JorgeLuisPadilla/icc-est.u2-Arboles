
public class Ejercicio2 {

    public Node<Integer> invert(Node<Integer> root) {

        if (root == null) {
            return null;
        }

        // Intercambiar hijos
        Node<Integer> aux = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(aux);

        // Invertir subárboles
        invert(root.getLeft());
        invert(root.getRight());

        return root;
    }
}
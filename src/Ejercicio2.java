public class Ejercicio2 {

    public Node<Integer> invert(Node<Integer> root) {

        if (root == null) {
            return null;
        }

        // Intercambiar hijos
        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        // Invertir subárboles
        invert(root.getLeft());
        invert(root.getRight());

        return root;
    }
}
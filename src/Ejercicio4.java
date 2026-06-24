public class Ejercicio4 {
    public int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        int izquierda = maxDepth(root.getLeft());
        int derecha = maxDepth(root.getRight());

        return Math.max(izquierda, derecha) + 1;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public List<List<Node>> listNiveles(Node root) {
        List<List<Node>> niveles = new ArrayList<>();
        llenarNiveles(root, 0, niveles);
        return niveles;
    }

    private void llenarNiveles(Node actual, int nivel, List<List<Node>> niveles) {

        if (actual == null) {
            return;
        }

        if (niveles.size() == nivel) {
            niveles.add(new ArrayList<>());
        }

        niveles.get(nivel).add(actual);

        llenarNiveles(actual.getLeft(), nivel + 1, niveles);
        llenarNiveles(actual.getRight(), nivel + 1, niveles);
    }
}
package structures.trees;

// Ejercicio 1: insertar varios números en un árbol binario y mostrarlo
public class Ejercicio1 {

    public BinaryTree<Integer> insert(int[] numeros) {
        BinaryTree<Integer> arbol = new BinaryTree<>();
        for (int numero : numeros) {
            arbol.insert(numero);
        }
        return arbol;
    }
}
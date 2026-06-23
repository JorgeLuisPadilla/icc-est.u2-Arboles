
public class Ejercicio1 {

    public void insert(int[] numeros) {

        BinaryTree<Integer> arbol = new BinaryTree<>();

        for (int numero : numeros) {
            arbol.insert(numero);
        }

        System.out.println("Imprimiendo el árbol:");
        arbol.printTree();
    }
}
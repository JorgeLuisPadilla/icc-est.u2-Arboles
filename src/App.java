import java.util.List;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
//import structures.trees.IntTree;
//import models.Person;

public class App {
    public static void main(String[] args) {
        runEjercicio1();
        runEjercicio2();
        runEjercicio3();
        runEjercicio4();
    }
 
    // Ejercicio 1: Insertar elementos en un árbol binario
    public static void runEjercicio1() {
        System.out.println("Ejercicio 1:");
 
        Ejercicio1 ejercicio1 = new Ejercicio1();
        BinaryTree<Integer> arbol = ejercicio1.insert(new int[]{5, 3, 7, 2, 4, 6, 8});
 
        System.out.println("Árbol construido:");
        arbol.printTree();
    }
 
    // Ejercicio 2: Invertir un árbol binario
    public static void runEjercicio2() {
        System.out.println("\nEjercicio 2:");
 
        BinaryTree<Integer> arbol = construirArbol(new int[]{5, 3, 7, 2, 4, 6, 8});
 
        System.out.println("Árbol original:");
        arbol.printTree();
 
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Node<Integer> raizInvertida = ejercicio2.invertTree(arbol.getRoot());
        arbol.setRoot(raizInvertida);
 
        System.out.println("Árbol invertido:");
        arbol.printTree();
    }
 
    // Ejercicio 3: Listar los nodos del árbol agrupados por nivel
    public static void runEjercicio3() {
        System.out.println("\nEjercicio 3:");
 
        BinaryTree<Integer> arbol = construirArbol(new int[]{4, 2, 7, 1, 3, 6, 9});
 
        Ejercicio3 ejercicio3 = new Ejercicio3();
 
        System.out.println("Input:");
        ejercicio3.imprimirArbolCentrado(arbol.getRoot());
 
        List<List<Node<Integer>>> niveles = ejercicio3.listLevels(arbol.getRoot());
 
        System.out.println();
        System.out.println("Output:");
        imprimirNiveles(niveles);
    }
 
    // Ejercicio 4: Calcular la profundidad máxima de un árbol binario
    public static void runEjercicio4() {
        System.out.println("\nEjercicio 4:");
 
        BinaryTree<Integer> arbol = construirArbol(new int[]{4, 2, 7, 1, 3, 8});
 
        System.out.println("Input:");
        arbol.printTree();
 
        Ejercicio4 ejercicio4 = new Ejercicio4();
        int profundidad = ejercicio4.maxDepth(arbol.getRoot());
 
        System.out.println();
        System.out.println("Output: " + profundidad);
    }
 
    // --- Métodos auxiliares, reutilizados por varios ejercicios ---
 
    // Evita repetir "crear árbol + insertar en bucle" en cada ejercicio
    private static BinaryTree<Integer> construirArbol(int[] numeros) {
        BinaryTree<Integer> arbol = new BinaryTree<>();
        for (int numero : numeros) {
            arbol.insert(numero);
        }
        return arbol;
    }
 
    // Imprime cada nivel como una cadena: valor -> valor -> valor
    private static void imprimirNiveles(List<List<Node<Integer>>> niveles) {
        for (List<Node<Integer>> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

   // public static void runPersonTree() {
        //BinaryTree<Person> personTree = new BinaryTree<>();
        //personTree.insert(new Person("Alice", 30));
        //personTree.insert(new Person("Bob", 25));
        //personTree.insert(new Person("Diego", 35));
        //personTree.insert(new Person("Rafael", 35));
        //personTree.insert(new Person("Ana", 35));

        //System.out.println("InOrder");
        //personTree.inOrder();
        //System.out.println("PreOrder");
        //personTree.preOrder();
   // }

    //private static void runIntTree() {
        //IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        // Node<Integer> node3 = new Node<>(30);
        // Node<Integer> node4 = new Node<>(40);
        // Node<Integer> node5 = new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRoot();

        // root.setLeft(node2);
        // root.setRight(node3);

        // node2.setLeft(node4);
        // node4.setRight(node5);

        //// ERROR GENERA CLICLOS
        // node5.setLeft(root);

        //arbolNumeros.insert(10);
        //arbolNumeros.insert(5);
        //arbolNumeros.insert(3);
        //arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20
        //arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
        //arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15

        //System.out.println("pre Order");

        //arbolNumeros.preOrder();
        //System.out.println("Pos Order");
        //arbolNumeros.posOrder();
        //System.out.println("Peso: ");
        //System.out.println(arbolNumeros.getPeso());
    //}
}
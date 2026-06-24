import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runIntTree();
        //runPersonTree();
        runEjercicio1();
        runEjercicio2();
        runEjercicio3();
        runEjercicio4();
    }

    //Ejercicio 1: Insertar elementos en un árbol binario

    public static void runEjercicio1(){
        System.out.println("Ejercicio 1:");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[]{5, 3, 7, 2, 4, 6, 8};
        ejercicio1.insert(numeros);
    }

    //Ejercicio 2: Invertir un árbol binario

    public static void runEjercicio2() {

    BinaryTree<Integer> tree = new BinaryTree<>();

    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);

    System.out.println("");
    System.out.println("Ejercicio 2:");
    
    System.out.println("Arbol original:");
    tree.printTree();

    Ejercicio2 ejercicio2 = new Ejercicio2();

    tree.setRoot(ejercicio2.invert(tree.getRoot()));

    System.out.println("Arbol invertido:");
    tree.printTree();
    }   

    //Ejercicio 3: Listar los niveles de un árbol binario de listas enlazadas

    private static void runEjercicio3() {

    System.out.println("");    
    System.out.println("Ejercicio 3:");

    BinaryTree<Integer> tree = new BinaryTree<>();

    int[] numeros = {5, 3, 7, 2, 4, 6, 8};

    for (int numero : numeros) {
        tree.insert(numero);
    }

    Ejercicio3 ejercicio3 = new Ejercicio3();

    List<List<Node>> niveles = ejercicio3.listNiveles(tree.getRoot());

    for (List<Node> nivel : niveles) {
        for (int i = 0; i < nivel.size(); i++) {

        System.out.print(nivel.get(i).getValue());

        if (i < nivel.size() - 1) {
            System.out.print(" -> ");
        }
    }

    System.out.println();
        }
    }

    //Ejercicio 4: Calcular la profundidad máxima de un árbol binario

    public static void runEjercicio4() {
    System.out.println("");
    System.out.println("Ejercicio 4:");

    BinaryTree<Integer> tree = new BinaryTree<>();

    int[] numeros = {4, 2, 7, 1, 3, 8, 6, 5, 1, 2};
    
    for (int numero : numeros) {
        tree.insert(numero);
    }

    Ejercicio4 ejercicio4 = new Ejercicio4();

    int profundidad = ejercicio4.maxDepth(tree.getRoot());

    System.out.println("Profundidad máxima: " + profundidad);

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
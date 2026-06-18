# Práctica: Árboles Binarios en Java

## Estudiante

* Nombre: Jorge Luis Padilla
* Carrera: Computación
* Asignatura: Estructura de Datos
* Profesor: Ing. Pablo Torres
* Grupo: 3

---

# Descripción general del proyecto

En esta práctica se implementó la estructura de datos Árbol Binario de Búsqueda (Binary Search Tree). Se desarrollaron clases genéricas y específicas (`BinaryTree<T>` e `IntTree`) para construir el árbol mediante la conexión de nodos (`Node<T>`). Se aplicó la recursividad para resolver problemas fundamentales como la inserción de datos, los diferentes tipos de recorridos (PreOrder, InOrder, PosOrder) y el cálculo de propiedades estructurales como la altura y el peso del árbol.

---

# Ejercicio 01: Implementación de Nodos e Inserción Recursiva

Se implementó la clase genérica `Node<T>` que almacena un valor y posee dos referencias (izquierda y derecha). A partir de esto, se creó la clase `BinaryTree<T>` con el método de inserción:

```java
public void insert(T value)

```

Este método permite agregar nuevos elementos manteniendo la propiedad de búsqueda del árbol (valores menores a la izquierda, mayores a la derecha) utilizando un enfoque recursivo.

### Código destacado

```java
// Recursivo para insertar valores en el ÁRBOL BINARIO
private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {
    if (actual == null) {
        return nodeInsertar;
    }

    // Validar si es mayor o menor y decidir si lo ingreso a la der o izq
    if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
        actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
    } else {
        actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
    }

    return actual;
}

```

---

# Ejercicio 02: Recorridos del Árbol (PreOrder, InOrder, PosOrder)

Se implementaron los tres recorridos en profundidad clásicos para visitar los nodos del árbol. Estos métodos permiten iterar sobre la estructura en diferentes secuencias lógicas utilizando recursividad.

* **PreOrder:** Visita la raíz, luego el subárbol izquierdo y finalmente el derecho.
* **InOrder:** Visita el subárbol izquierdo, luego la raíz y finalmente el derecho (útil para obtener los elementos ordenados).
* **PosOrder:** Visita los subárboles izquierdo y derecho antes de procesar la raíz.

### Código de Recorridos (Ejemplo con InOrder y PreOrder)

```java
// InOrder
public void inOrder() {
    inOrderRecursivo(root);
}

private void inOrderRecursivo(Node<T> actual) {
    if (actual == null)
        return;
    inOrderRecursivo(actual.getLeft());
    System.out.println(actual + " ");
    inOrderRecursivo(actual.getRight());
}

// PreOrder
public void preOrder() {
    preOrderRecursivo(root);
}

private void preOrderRecursivo(Node<T> actual) {
    if (actual == null)
        return;
    System.out.print(actual + " ");
    preOrderRecursivo(actual.getLeft());
    preOrderRecursivo(actual.getRight());
}

```

---

# Ejercicio 03: Cálculo de Altura y Peso del Árbol

Para comprender la magnitud de la estructura de datos, se crearon métodos que calculan sus propiedades físicas:

* **Altura:** Retorna el nivel de profundidad máximo del árbol.
* **Peso (Cantidad de nodos):** Cuenta el total de elementos instanciados dentro del árbol binario.

Ambos métodos operan de forma recursiva sumando el resultado de las ramificaciones.

### Código

```java
// Altura
public int altura() {
    return alturaRecursivo(root);
}

private int alturaRecursivo(Node<T> actual) {
    if (actual == null)
        return 0;
    int alturaIzquierda = alturaRecursivo(actual.getLeft());
    int alturaDerecha = alturaRecursivo(actual.getRight());
    return Math.max(alturaIzquierda, alturaDerecha) + 1;
}

// Cantidad de nodos / Peso
public int peso() {
    return pesoRecursivo(root);
}

private int pesoRecursivo(Node<T> actual) {
    if (actual == null)
        return 0;
    int pesoIzquierdo = pesoRecursivo(actual.getLeft());
    int pesoDerecho = pesoRecursivo(actual.getRight());
    return pesoIzquierdo + pesoDerecho + 1;
}

```

---

# Ejecución desde App.java

La clase principal ejecuta las pruebas utilizando el modelo de datos `Person`. Al usar el árbol genérico `BinaryTree<Person>`, los elementos se organizan según su criterio de comparación (que debe estar definido en la interfaz `Comparable` de la clase `Person`).

### Código principal

```java
public class App {
    public static void main(String[] args) throws Exception {
        runPersonTree();
    }

    public static void runPersonTree() {
        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Diego", 35));
        personTree.insert(new Person("Rafael", 35));
        personTree.insert(new Person("Ana", 35));

        System.out.println("InOrder");
        personTree.inOrder();
        System.out.println("PreOrder");
        personTree.preOrder();
    }
}

```

### Salida por consola

*(La salida mostrará primero la lista de personas organizada alfabéticamente o según la edad por el método InOrder, y luego estructurada por la raíz mediante PreOrder).*
# Práctica: Árboles Binarios en Java

## Estudiante

* Nombre: Jorge Luis Padilla
* Carrera: Computación
* Asignatura: Estructura de Datos
* Profesor: Ing. Pablo Torres
* Grupo: 3

# Ejercicio 01: Inserción de Arreglos en un Árbol Binario

Se implementó una clase denominada `Ejercicio1`, cuya función consiste en recibir un arreglo de números enteros e insertar cada elemento dentro de un árbol binario de búsqueda. La inserción se realiza mediante un recorrido del arreglo utilizando un ciclo `for-each`, permitiendo construir el árbol de manera automática.

Una vez agregados todos los elementos, se utiliza el método `printTree()` para mostrar gráicamente la estructura generada.

### Código

```java
public void insert(int[] numeros) {

        BinaryTree<Integer> arbol = new BinaryTree<>();

        for (int numero : numeros) {
            arbol.insert(numero);
        }

        System.out.println("Imprimiendo el árbol:");
        arbol.printTree();
    }
```

---

# Ejercicio 02: Inversión del Árbol Binario

En este ejercicio se desarrolló un algoritmo recursivo encargado de invertir completamente la estructura del árbol. Para ello, en cada nodo se intercambian las referencias del hijo izquierdo y del hijo derecho. Posteriormente, el proceso se repite recursivamente sobre ambos subárboles hasta recorrer toda la estructura.

Gracias a esta operación, el árbol original queda reflejado de forma simétrica.

### Código

```java
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
```

### Salida por consola

![alt text](image.png)

# Explicacion

En el ejercicio 1 lo que hice fue insertar los numeros en el arreglo para despues por medio de BinaryTree cree las soluciones haciendo uso de los niveles y usando inOrder el cual me dio el arbol en orden y lo unico que hice fue ordenar por niveles saltanto espacios por cada nivel con el uso de printTree(), aplicando de la misma manera como lo hicimos con los otros ejemplos. 
En el ejercicio 2 fue similar pero me conplico por el cambio a Nodo, la solucion fue sencilla, solo use el metodo InOrder pero ivertido, al reves, quedando asi en orden descendente, y por ultimo utilice el metodo printTree() para ordenar de tal manera que mi arbol quedo ordenado de cierta manera.

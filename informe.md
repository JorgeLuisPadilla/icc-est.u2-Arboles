# Práctica: Árboles Binarios en Java

## Estudiante

* Nombre: Jorge Luis Padilla
* Carrera: Computación
* Asignatura: Estructura de Datos
* Profesor: Ing. Pablo Torres
* Grupo: 3

# Ejercicio 01: Inserción de Arreglos en un Árbol Binario

Lo que pide este ejercicio es agarrar un arreglo de números y meterlos uno por uno en un árbol binario. Recorro el arreglo con un `for` y por cada número le digo al árbol "inserta esto", usando el método `insert()` que ya tenía hecho en `BinaryTree` (si el número es menor va a la izquierda, si es mayor o igual va a la derecha). Al final lo muestro en consola con `printTree()`.

### Código

```java
public BinaryTree<Integer> insert(int[] numeros) {
        BinaryTree<Integer> arbol = new BinaryTree<>();
        for (int numero : numeros) {
            arbol.insert(numero);
        }
        return arbol;
    }
```

---

# Ejercicio 02: Inversión del Árbol Binario

Este ejercicio pide voltear el árbol como un espejo: lo que estaba a la izquierda pasa a la derecha y al revés, en todos los niveles. En cada nodo simplemente intercambio su hijo izquierdo con su hijo derecho, y luego repito esto mismo en cada hijo usando recursividad. Así cada nodo se encarga de su propio cambio y le pasa la tarea a sus hijos, hasta invertir todo el árbol. El caso base es cuando el nodo es `null`: ahí no hay nada que invertir y simplemente regreso.

### Código

```java
    public Node<Integer> invertTree(Node<Integer> nodoActual) {
        if (nodoActual == null) {
            return null;
        }

        // Intercambiar los hijos del nodo actual
        Node<Integer> hijoIzquierdo = nodoActual.getLeft();
        nodoActual.setLeft(nodoActual.getRight());
        nodoActual.setRight(hijoIzquierdo);

        // Repetir el mismo intercambio en cada subárbol
        invertTree(nodoActual.getLeft());
        invertTree(nodoActual.getRight());

        return nodoActual;
    }
```
# Ejercicio 03: Listar niveles en Listas Enlazadas

Aquí se pide separar los nodos del árbol según el nivel en el que están. Uso una lista de listas: la de afuera representa los niveles, y cada lista de adentro tiene los nodos de ese nivel. Recorro el árbol con recursividad pasando un número que indica en qué nivel estoy (la raíz empieza en 0). Si todavía no existe una lista para ese nivel la creo, agrego el nodo ahí, y sigo bajando por la izquierda y la derecha sumando 1 al nivel cada vez. Al final solo recorro esa lista de listas para imprimir cada nivel.

### Código

```java
    public List<List<Node<Integer>>> listLevels(Node<Integer> raiz) {
    List<List<Node<Integer>>> niveles = new ArrayList<>();
    agregarPorNivel(raiz, 0, niveles);
    return niveles;
}

private void agregarPorNivel(Node<Integer> actual, int nivel, List<List<Node<Integer>>> niveles) {
    if (actual == null) {
        return;
    }
    if (niveles.size() == nivel) {
        niveles.add(new ArrayList<>());
    }
    niveles.get(nivel).add(actual);

    agregarPorNivel(actual.getLeft(), nivel + 1, niveles);
    agregarPorNivel(actual.getRight(), nivel + 1, niveles);
}

public void imprimirArbolCentrado(Node<Integer> raiz) {
    List<List<Node<Integer>>> niveles = listLevels(raiz);
    int altura = niveles.size();

    for (int i = 0; i < altura; i++) {
        StringBuilder fila = new StringBuilder();
        for (int espacio = 0; espacio < altura - i; espacio++) {
            fila.append("  ");
        }

        List<Node<Integer>> nivel = niveles.get(i);
        for (int j = 0; j < nivel.size(); j++) {
            fila.append(nivel.get(j).getValue());
            if (j < nivel.size() - 1) {
                fila.append(" ");
            }
        }

        System.out.println(fila);
    }
}
```

---

# Ejercicio 04: Calcular la profundidad maxima

Este ejercicio pide calcular qué tan "alto" es el árbol, o sea cuántos niveles tiene desde la raíz hasta la rama más larga. Si el nodo no existe, su profundidad es 0. Si existe, calculo la profundidad del lado izquierdo y la del derecho por separado, me quedo con la más grande, y le sumo 1 por el nodo en el que estoy parado. Como esto se repite en cada nodo, al final la función compara todas las ramas y devuelve el camino más largo del árbol.

### Código

```java
    public int maxDepth(Node<Integer> raiz) {
        if (raiz == null) {
            return 0;
        }

        int profundidadIzquierda = maxDepth(raiz.getLeft());
        int profundidadDerecha = maxDepth(raiz.getRight());

        return Math.max(profundidadIzquierda, profundidadDerecha) + 1;
    }
```


### Salida por consola del Ejercicio 1 al 2

![alt text](assets/Captura%20de%20pantalla%202026-06-22%20220013.png)

### Salida por consola del Ejercicio 3 al 4

![alt text](<assets/Captura de pantalla 2026-06-23 214700.png>)

# Explicacion todos los ejercicios

En el ejercicio 1 lo que hice fue insertar los numeros en el arreglo para despues por medio de BinaryTree cree las soluciones haciendo uso de los niveles y usando inOrder el cual me dio el arbol en orden y lo unico que hice fue ordenar por niveles saltanto espacios por cada nivel con el uso de printTree(), aplicando de la misma manera como lo hicimos con los otros ejemplos. 
En el ejercicio 2 fue similar pero me conplico por el cambio a Nodo, la solucion fue sencilla, solo use el metodo InOrder pero ivertido, al reves, quedando asi en orden descendente, y por ultimo utilice el metodo printTree() para ordenar de tal manera que mi arbol quedo ordenado de cierta manera.En el ejercicio 3 fue sencillo, lo unico que se hizo para separar los nodos fue guardarlos en un arraylist para despues ordenar de arriba hacia abajo, usando imprimirArbolCentrado dando espacios por niveles. En el ejercicio 4 fue sencillo usando Math.max es sencillo por que solo regresamos el ultimo nivel del arbol.

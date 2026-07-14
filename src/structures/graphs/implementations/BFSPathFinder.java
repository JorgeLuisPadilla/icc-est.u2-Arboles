package structures.graphs.implementations;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import structures.graphs.Graph;
import structures.graphs.PathFinder;
import structures.graphs.PathResult;
import structures.node.Node;

public class BFSPathFinder<T> implements PathFinder<T> {

    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end) {

        Queue<T> queue = new LinkedList<>();
        Set<T> visitados = new LinkedHashSet<>();
        Map<Node<T>, Node<T>> parent = new LinkedHashMap<>();

        queue.add(start);
        visitados.add(start);
        parent.put(new Node<>(start), null);

        while (!queue.isEmpty()) {

            T current = queue.poll();

            if (current.equals(end)) {
                return new PathResult<>(visitados, buildPath(parent, end));
            }

            for (Node<T> vecino : graph.getVecinos(current)) {

                if (!visitados.contains(vecino.getValue())) {

                    visitados.add(vecino.getValue());
                    queue.add(vecino.getValue());
                    parent.put(vecino, new Node<>(current));

                }
            }
        }

        return new PathResult<>(visitados, new LinkedHashSet<>());
    }

    private Set<T> buildPath(Map<Node<T>, Node<T>> parent, T end) {

        LinkedHashSet<T> path = new LinkedHashSet<>();

        Node<T> actual = new Node<>(end);

        while (actual != null) {
            path.add(actual.getValue());
            actual = parent.get(actual);
        }

        return path;
    }

}
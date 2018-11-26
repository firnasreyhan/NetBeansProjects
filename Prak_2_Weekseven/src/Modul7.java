
/**
 *
 * @author yohan
 */
public class Modul7 {

    public static void main(String[] args) {
        Graph g = new Graph();
        GraphNode[] graph_node_list = {
            new GraphNode(0),
            new GraphNode(1),
            new GraphNode(2),
            new GraphNode(3),
            new GraphNode(4)};

        for (GraphNode graph_node : graph_node_list) {
            g.add_node(graph_node);
        }

        int[][] path_list = {
            {0, 1, 1},
            {0, 2, 1},
            {1, 3, 1},
            {2, 3, 1},
            {3, 4, 2}
        };

        for (int[] path : path_list) {
            GraphNode first_node = graph_node_list[path[0]];
            GraphNode second_node = graph_node_list[path[1]];
            double distance = path[2];
            g.add_edge(new GraphEdge(first_node, second_node, distance));
            g.add_edge(new GraphEdge(second_node, first_node, distance));
        }
        g.to_tree(0).print();
    }

}

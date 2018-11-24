
import java.io.*;
import java.util.*;

/**
 *
 * @author Rey
 */
public class BFS_DFS {

    private int V;
    private LinkedList<Integer> adj[];

    BFS_DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println("");
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
        System.out.println("");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int angka;
        BFS_DFS g = new BFS_DFS(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 4);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(4, 2);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        do {
            System.out.print("Masukkan angka 0-6 = ");
            angka = sc.nextInt();
        } while (angka < 0 || angka > 6);
        System.out.println("Hasil BFS : ");
        g.BFS(angka);
        System.out.println("Hasil DFS : ");
        g.DFS(angka);
    }
}

/**
 * class MyGraph. Will use Matrix to represent a simple weighted directed graph. There is no loop at vertex.
 * No more than one edge from vertex i to another vertex j. The vertices are numbered as 1, 2, ..., n
 * The graph with n vertices is represented by an (n+1) by (n+1) matrix with row 0 and column 0 unused.
 * If there is an edge from vertex i to vertex j (i != j), then entry on row i column j of the matrix will
 * be 1. If there is no edge between vertex i to vertex j (i != j), then the entry on row i column j of the
 * matrix will be Integer.MAX_VALUE
 *
 * @author Austin Howard
 * @version July 13, 2024
 */
import java.util.*;
public class MyGraph
{
    private int[][] graph;
    private int numberOfVertices;

    /**
     * create a graph with given number of vertices with no edges
     * @param numberOfVertices number of vertices of the graph
     */
    public MyGraph(int numberOfVertices){
        this.numberOfVertices = numberOfVertices;
        graph = new int[numberOfVertices+1][numberOfVertices+1];
    }

    /**
     * create a graph with given matrix representation
     * @param graph The matrix representation on the given graph. Assume column 0 and row 0 are not used
     */
    public MyGraph(int [][] graph){
        this.graph = graph;
        // change any 0 to infinity if the 0 is not on diagonal
        for(int i = 1; i < graph.length; i++){
            for(int j = 1; j < graph.length; j++){
                if(i == j) graph[i][j] = 0;
                else if(i != j && graph[i][j] == 0)
                    graph[i][j] = Integer.MAX_VALUE;
            }
        }
        numberOfVertices = graph.length - 1;
    }

    /**
     * return a String that represent the vertices in order if the BFS algorithm is used to traversal the graph
     * starting from the given vertex. If the startVertex not exists, return an error message
     * @param startVertex The vertex where the traversal starts
     * @return A String that describes the vertices visited in order
     */
    public String bfs(int startVertex) {
        // Return error message if startVertex doesn't exist
        if (startVertex < 1 || startVertex > numberOfVertices) {
            return "Error: Selected Vertex does not exist.";
        }

        // Initialize data structures for BFS traversal
        boolean[] visited = new boolean[numberOfVertices + 1];
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        // Start BFS from startVertex and mark as visited
        queue.add(startVertex);
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and append it to the result
            int vertex = queue.poll();
            result.append(vertex).append(", ");

            for (int i = 1; i <= numberOfVertices; i++) {
                // If there's an edge to vertex i and it's not visited yet,
                // enqueue and mark visited
                if (graph[vertex][i] != Integer.MAX_VALUE && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

        // Remove the trailing comma and space
        if (!result.isEmpty()) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }


    /**
     * return a String that represents the vertices in order if the DFS algorithm is used to traversal the graph
     * starting from the given vertex. If the startVertex not exist, return an error message
     * @param startVertex The vertex where the traversal starts
     * @return An ArrayList of Integer that represents the vertices visited in order
     */
    public String dfs(int startVertex) {
        // Return error message if startVertex doesn't exist
        if (startVertex < 1 || startVertex > numberOfVertices) {
            return "Error: Selected Vertex does not exist.";
        }

        // Initialize data structures for DFS traversal
        boolean[] visited = new boolean[numberOfVertices + 1];
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        // Start DFS from startVertex
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            // Pop a vertex from the top of the stack
            int vertex = stack.pop();

            // If vertex isn't visited, process it
            if (!visited[vertex]) {
                result.append(vertex).append(", ");
                visited[vertex] = true;

                // Push adjacent vertices onto the stack in reverse order
                for (int i = numberOfVertices; i >= 1; i--) {
                    // If there's an edge to vertex i and it's not visited yet,
                    // push onto the stack
                    if (graph[vertex][i] != Integer.MAX_VALUE && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }

        // Remove the trailing comma and space
        if (!result.isEmpty()) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }

}

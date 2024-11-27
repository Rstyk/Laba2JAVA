import data.Graph;
import logic.GraphLogic;
import output.GraphOutput;

public class Main {

    public static void main(String[] args) {
        GraphLogic graphLogic = new GraphLogic();
        GraphOutput graphOutput = new GraphOutput();

        Graph directedGraph = new Graph(true);
        graphLogic.addVertex(directedGraph, "F", 5);
        graphLogic.addVertex(directedGraph, "D", 20);

        graphLogic.addEdge(directedGraph, "F", "D");

        System.out.println("Орієнтований граф:");
        graphOutput.printGraph(directedGraph);

        Graph undirectedGraph = new Graph(false);
        graphLogic.addVertex(undirectedGraph, "E", 40);
        graphLogic.addVertex(undirectedGraph, "R", 50);

        graphLogic.addEdge(undirectedGraph, "E", "R");

        System.out.println("\nНеорієнтований граф:");
        graphOutput.printGraph(undirectedGraph);
    }
}
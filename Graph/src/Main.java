public class Main
{
	public static void main(String[] args)
	{
		AdjList test= new AdjList(6);
		test.addEdge(0, 1);
		test.addEdge(0, 3);
		test.addEdge(2, 0);
		test.addEdge(0, 4);
		test.addEdge(0, 5);
		

		com.touchgraph.graphlayout.TGPanel.drawGraph(test, 5);
		
	}
}

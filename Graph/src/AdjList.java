
public class AdjList implements IGraph
{

	private int numver;
	private int numed;
	private Bag[] list;
	
	public AdjList(int num)
	{
		numver=num;
		numed=0;
		list= (Bag<Integer>[])new Bag[num];
	}
	@Override
	public int V()
	{
		// TODO Auto-generated method stub
		return numver;
	}

	@Override
	public int E()
	{
		// TODO Auto-generated method stub
		return numed;
	}

	@Override
	public void addEdge(int v, int w)
	{
		// TODO Auto-generated method stub
		
		list[v].add(w);
		list[w].add(v);
		numed++;
		numver++;
		
	}

	@Override
	public Iterable<Integer> adj(int v)
	{
		// TODO Auto-generated method stub
		return (Iterable<Integer>) list[v].iterator();
	}

}

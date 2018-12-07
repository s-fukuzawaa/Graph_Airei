import java.util.ArrayList;

public class AdjMatrix implements IGraph
{
	private int numver;
	private int numed;
	private int[][] arr;

	public AdjMatrix(int num)
	{
		numver=num;
		numed=0;
		arr= new int[num][num];
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
		arr[v][w]=1;
		arr[w][v]=1;
		numed++;
		
	}

	@Override
	public Iterable<Integer> adj(int v)
	{
		// TODO Auto-generated method stub
		ArrayList temp= new ArrayList();
		for(int i=0; i<arr[v].length; i++)
		{
			if(arr[v][i]==1)
			{
				temp.add(i);
			}
		}
		return temp;
	}

}

import java.util.ArrayList;

public class Deposito
{
	private ArrayList<Produto> deposit;

	public Deposito()
	{
		deposit = new ArrayList<Produto>();
	}

	public void addItem(Produto p)
	{
		deposit.add(p);
	}
	
	public void removeItem(Produto p)
	{
		deposit.remove(p);
	}

	public int size()
	{
		return deposit.size();
	}

	public boolean isEmpty()
	{
		return deposit.isEmpty();
	}
}

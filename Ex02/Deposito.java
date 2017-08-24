import java.util.ArrayList;

public class Deposito
{
	private ArrayList<Produto> deposit;

	public Deposito()
	{
		deposit = new ArrayList<Produto>();
	}

	public Produto get(int index)
	{
		return deposit.get(index);
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

	public Produto maiorPreco()
	{
		Produto maior = deposit.get(0);
		for(int i = 1; i < deposit.size(); i++)
		{
			Produto p = deposit.get(i);

			if(p.getPreco() > maior.getPreco())
			{
				maior = p;
			}
		}

		return maior;
	}
}

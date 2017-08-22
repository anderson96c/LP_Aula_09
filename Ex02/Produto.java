
public class Produto
{
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
	private Date data_fab;

	public Produto (String nome_, double preco_, String marca_, String descricao_, Date data_fab_)
	{
		nome = nome_;
		preco = preco_;
		marca = marca_;
		descricao = descricao_;
		data_fab = data_fab_;
	}

	public void setNome(String n)
	{
		nome = n;
	}
	
	public void setPreco(double p)
	{
		preco = p;
	}

	public void setMarca(String m)
	{
		marca = m;
	}

	public void setDescricao(String d)
	{
		descricao = d;
	}

	public void setDataFab(Date dt)
	{
		data_fab = dt;
	}

	public String getNome()
	{
		return nome;
	}
	
	public double getPreco()
	{
		return nome;
	}

	public String getMarca()
	{
		return marca;
	}

	public String getDescricao()
	{
		return descricao;
	}
	
	public Date getDataFab()
	{
		return data_fab;;
	}
}

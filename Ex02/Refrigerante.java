
public class Refrigerante extends ProdutoNaoDuravel
{
	private String sabor;
	private double litros;

	public Refrigerante(String nome_, double preco_, String marca_, String descricao_, Date data_fab_,
                            Date dataVal_, String genero_, String sabor_, double litros_)
	{
		super(nome_, preco_,marca_, descricao_, data_fab_,
                      dataVal_, genero_);

		sabor = sabor_;
		litros = litros_;
	}

	public String getSabor()
	{
		return sabor;
	}

	public double getLitros()
	{
		return litros;
	}
	
	public void drink()
	{
		if(litros <= 0)
		{
			System.out.println("Acabou!");
		}
		
		else
		{
			litros = litros - 0.5;
		}
	}
		
}

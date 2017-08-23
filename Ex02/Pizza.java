
public class Pizza extends ProdutoNaoDuravel
{
	private String sabor;
	private int pedacos;

	public Pizza(String nome_, double preco_, String marca_, String descricao_, Date data_fab_,
                              Date dataVal_, String genero_, String sabor_, int pedacos_)
	{
		super(nome_, preco_,marca_, descricao_, data_fab_,
                      dataVal_, genero_);

		sabor = sabor_;
		pedacos = pedacos_;
	}

	/**
	Sem sets jah que nao faz sentido mudar o sabor 
	ou tamanho de uma pizza depois dela estar pronta
	*/

	public String getSabor()
	{
		return sabor;
	}

	public int getPedacos()
	{
		return pedacos;
	}
	
	public void eatSlice()
	{
		if(pedacos <= 0)
		{
			System.out.println("Acabou!");
		}

		else
			pedacos--;
	}


}

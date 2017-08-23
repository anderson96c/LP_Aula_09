
public class Chocolate extends ProdutoNaoDuravel
{
	private String tipo;
	private int pedacos;

	public Chocolate(String nome_, double preco_, String marca_, String descricao_, Date data_fab_,
                         Date dataVal_, String genero_, String tipo_, int pedacos_)
	{
		super(nome_, preco_,marca_, descricao_, data_fab_,
                      dataVal_, genero_);

		tipo = tipo_;
		pedacos = pedacos_;
	}

	public String getTipo()
	{
		return tipo;
	}

	public int getPedacos()
	{
		return pedacos;
	}

	public void eat()
	{
		pedacos--;
	}

	

}

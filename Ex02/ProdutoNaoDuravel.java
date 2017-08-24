
public class ProdutoNaoDuravel extends Produto
{

	private String dataVal;
	private String genero;

	public ProdutoNaoDuravel(String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                              String dataVal_, String genero_)
	{
		super(nome_, preco_, marca_, descricao_, data_fab_);

		dataVal = dataVal_;
		genero = genero_;
	}

	public void setDataVal(String d)
	{
		dataVal = d;
	}

	public void setGenero(String g)
	{
		genero = g;
	}

	public String getDataVal()
	{
		return dataVal;
	}

	public String getGenero()
	{
		return genero;
	}


}

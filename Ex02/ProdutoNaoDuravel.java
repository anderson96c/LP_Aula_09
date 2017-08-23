
public class ProdutoNaoDuravel extends Produto
{

	private Date dataVal;
	private String genero;

	public ProdutoDuravel(String nome_, double preco_, String marca_, String descricao_, Date data_fab_,
                              Date dataVal_, String genero_)
	{
		super(nome_, preco_, marca_, descricao_, data_fab_);

		dataVal = dataVal_;
		genero = genero_;
	}

	public void setDataVal(Date d);
	{
		dataVal = d;
	}

	public void setGenero(String g)
	{
		genero = g;
	}

	public Date getDataVal()
	{
		return dataVal;
	}

	public String getGenero()
	{
		return genero;
	}


}

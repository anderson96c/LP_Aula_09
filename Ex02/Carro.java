
public class Carro extends ProdutoDuravel
{
	private String modelo;
	private double quilometros;

	public Carro(String nome_, double preco_, String marca_, String descricao_, String data_fab_,
                     String materialPred_, int durabilidade_, String modelo_, double quilometros_)
	{
		super(nome_, preco_, marca_, descricao_, data_fab_,
		      materialPred_, durabilidade_);

		modelo = modelo_;
		quilometros = quilometros_;
	}

	public String getModelo()
	{
		return modelo;
	}

	public double getQuilometros()
	{
		return quilometros;
	}
	
	public void drive(double q)
	{
		quilometros = quilometros + q;
	}

}

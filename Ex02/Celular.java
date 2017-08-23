
public class Celular extends ProdutoDuravel
{
	private String operadora;
	private int bateria;

	public Celular(String nome_, double preco_, String marca_, String descricao_, Date data_fab_,
                       String materialPred_, int durabilidade_, String operadora_)
	{
		super(nome_, preco_, marca_, descricao_, data_fab_,
		      materialPred_, durabilidade_);

		operadora = operadora_;
		bateria = 100;
	}

	public String getOperadora()
	{
		return operadora;
	}

	public int getBateria()
	{
		return bateria;
	}
	
	public void usar()
	{
		if(bateria <= 0)
		{
			System.out.println("Descarregado!");
		}
		else if(bateria < 20)
		{
			bateria = 0;
		}
		bateria = bateria - 20; 
	}

}

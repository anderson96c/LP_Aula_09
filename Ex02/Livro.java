
public class Livro extends ProdutoDuravel
{
	private int paginas;
	private int pagMarcador;
	
	Livro(String nome_, double preco_, String marca_, String descricao_, String data_fab_,
              String materialPred_, int durabilidade_, int paginas_)
	{
		super(nome_, preco_, marca_, descricao_, data_fab_,
		      materialPred_, durabilidade_);

		paginas = paginas_;
		pagMarcador = 0;
	}

	public int getPaginas()
	{
		return paginas;
	}

	public int getPagMarcador()
	{
		return pagMarcador;
	}

	public void ler(int p)
	{
		
		if(p < 0)
		{
			System.out.println("Você não pode ler um número de páginas negativo!");
		}
		else if(pagMarcador >= paginas)
		{
			System.out.println("Terminou!");
		}

		else if(p >= (paginas - pagMarcador))
		{
			pagMarcador = paginas;
		}

		else
		{
			pagMarcador = pagMarcador + p;
		}
	}
}

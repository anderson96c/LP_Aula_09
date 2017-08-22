
public class Professor
{
	private String nome;
	private String matricula;
	private int idade;

	public Professor(String nome_, String matricula_, int idade_)
	{
		nome = nome_;
		matricula = matricula_;
		idade = idade_;
	}

	public void setNome(String novoNome)
	{ 
		nome = novoNome;
	}
	
	public String getName()
	{
		return nome;
	}

	public void setMatricula(String novaMatricula)
	{ 
		matricula = novaMatricula;
	}
	
	public String getMatricula()
	{
		return matricula;
	}

	public void setIdade(int novaIdade)
	{
		idade = novaIdade;
	}

	public int getIdade()
	{
		return idade;
	}

	public void print()
	{
		System.out.println("Professor: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Idade: " + idade);
	}

	
}

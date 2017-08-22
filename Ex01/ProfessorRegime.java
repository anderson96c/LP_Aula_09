
public class ProfessorRegime extends Professor
{
	private double salario;

	ProfessorRegime(String nome_, String matricula_, int idade_, double salario_)
	{
		super(nome_, matricula_, idade_);
		salario = salario_;
	}

	public void setSalario(double valor)
	{
		salario = valor;
	}
	
	public double getSalario()
	{
		return salario;
	}
}

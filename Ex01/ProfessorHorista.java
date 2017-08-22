
public class ProfessorHorista extends Professor
{
	int total_horas;
	double salario_hora;

	ProfessorHorista(String nome_, String matricula_, int idade_, int tHoras, double sHora)
	{
		super(nome_, matricula_, idade_);
		total_horas = tHoras;
		salario_hora = sHora;
	}

	public void setTotalHoras(int tHoras)
	{
		total_horas = tHoras;
	}

	public int getTotaHoras()
	{
		return total_horas;
	}

	public void setSalarioHora(double sHora)
	{
		salario_hora = sHora;
	}
	
	public double getSalario()
	{
		return (total_horas * salario_hora);
	}

	

	
}

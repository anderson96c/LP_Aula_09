/**
*
* Classe ProfessorHorista
*
* Herdeira da classe "Professor"
*
* Acrescenta os atributos 'salario por hora' e 'total de horas trabalhadas'
* e métodos para esses atributos
*
*@Autor Anderson Caio da Fonseca Santos 
*/
public class ProfessorHorista extends Professor
{
	//Atributos de um ProfessorHorista
	int total_horas;
	double salario_hora;


	/**
	 * Método construtor da classe
	 *
	 * Construtor 'super' herdado da classe Professor
	 */
	ProfessorHorista(String nome_, String matricula_, int idade_, int tHoras, double sHora)
	{
		super(nome_, matricula_, idade_);
		total_horas = tHoras;
		salario_hora = sHora;
	}

	/**
	 *Substitui o atributo total de horas trabalhadas pelo parametro passado
	 *
	 *@param	int		nova quantidade de horas trabalhadas
	 */

	public void setTotalHoras(int tHoras)
	{
		total_horas = tHoras;
	}

	/**
	 *Retorna o total de horas trabalhadas pelo professor
	 *
	 *@return	int		total de horas trabalhadas pelo professor
	 */

	public int getTotaHoras()
	{
		return total_horas;
	}

	/**
	 *Substitui o atributo salario por hora pelo parametro passado
	 *
	 *@param	double		nova quantia recebida por hora trabalhada
	 */

	public void setSalarioHora(double sHora)
	{
		salario_hora = sHora;
	}

	/**
	 *Retorna o valor ganho por hora trabalhada
	 *
	 *@return	double		valor ganho por hora trabalhada
	 */
	
	public double getSalario()
	{
		return (total_horas * salario_hora);
	}

	

	
}

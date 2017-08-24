/**
*
* Classe ProfessorRegime
*
* Herdeira da classe "Professor"
*
* Acrescenta o atributo 'salario'
* e métodos para esse atributo
*
*@Autor Anderson Caio da Fonseca Santos 
*/
public class ProfessorRegime extends Professor
{
	//Salario do ProfessorRegime
	private double salario;
	
	/**
	 * Método construtor da classe
	 *
	 * Construtor 'super' herdado da classe Professor
	 */
	ProfessorRegime(String nome_, String matricula_, int idade_, double salario_)
	{
		super(nome_, matricula_, idade_);
		salario = salario_;
	}

	/**
	 *Substitui o atributo salario pelo parametro passado
	 *
	 *@param	double		novo valor do salario
	 */

	public void setSalario(double valor)
	{
		salario = valor;
	}
	
	/**
	 *Retorna o salario atual do ProfessorRegime
	 *
	 *@return	double		valor do salario
	 */

	public double getSalario()
	{
		return salario;
	}
}

/**
*
* Classe Professor
*
* Pai das Classes "ProfessorRegime" e "ProfessorHorista"
*
* Define os atributos e métodos gerais para objetos "Professor"
*
*@Autor Anderson Caio da Fonseca Santos 
*/
public class Professor
{
	//Atributos de um Professor
	private String nome;
	private String matricula;
	private int idade;
	
	/**
	 * Método construtor da classe
	 */
	public Professor(String nome_, String matricula_, int idade_)
	{
		nome = nome_;
		matricula = matricula_;
		idade = idade_;
	}

	/**
	 *Substitui o atributo nome pelo parametro passado
	 *
	 *@param	String		novo nome do Professor
	 */

	public void setNome(String novoNome)
	{ 
		nome = novoNome;
	}

	/**
	 *Retorna o atributo nome do Professor
	 *
	 *@return	String		nome do Professor
	 */
	
	public String getNome()
	{
		return nome;
	}
	
	/**
	 *Substitui o atributo matricula pelo parametro passado
	 *
	 *@param	String		nova matricula do Professor
	 */

	public void setMatricula(String novaMatricula)
	{ 
		matricula = novaMatricula;
	}
	
	/**
	 *Retorna o atributo matricula do Professor
	 *
	 *@return	String		matricula do Professor
	 */	

	public String getMatricula()
	{
		return matricula;
	}

	/**
	 *Substitui o atributo idade pelo parametro passado
	 *
	 *@param	int		nova idade do Professor
	 */

	public void setIdade(int novaIdade)
	{
		idade = novaIdade;
	}

	/**
	 *Retorna o atributo idade do Professor
	 *
	 *@return	int		idade do Professor
	 */

	public int getIdade()
	{
		return idade;
	}
	/**
	 * Método para printar os atributos do Professor
	 */
	public void print()
	{
		System.out.println("Professor: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Idade: " + idade);
	}

	
}

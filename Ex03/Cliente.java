/**
*
* Classe Cliente
*
*
* Classe destinada a definir um cliente que alugara um objeto da classe Veiculo
* atraves das funcionalidades da classe Locadora
*
*@Autor Anderson Caio da Fonseca Santos
*/

public class Cliente
{
	//Atributos de um Cliente
	private String nome;
	private int numCarteira;

	/**
	 *Método construtor da classe
	 *
	 *@param	String		nome_		nome do cliente
	 *@param	int 		numCarteira_	numero da carteira de motorista
	 */

	public Cliente(String nome_, int numCarteira_)
	{
		nome = nome_;
		numCarteira = numCarteira_;
	}
	
	/**
	 *Atribui um novo nome ao cliente
 	 *
	 *@param	String		novo nome	
	 */
	
	public void setNome(String n)
	{
		nome = n;
	}
	
	/**
	 *Atribui um novo numero de carteira ao cliente
 	 *
	 *@param	int		novo numero de carteira	
	 */
	
	public void setNumCarteira(int n)
	{
		numCarteira = n;
	}

	/**
	 *@return	String		nome do cliente
	 */

	public String getNome()
	{
		return nome;
	}

	/**
	 *@return	int		numero da carteira
	 */

	public int getNumCarteira()
	{
		return numCarteira;
	}



}

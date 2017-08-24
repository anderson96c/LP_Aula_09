/**
*
* Classe Moto
*
* Herdeira da classe "Veiculo"
*
* Adiciona os atributos 'tipo de partida' e 'cilindradas'
* e métodos para manipular esses atributos
*
*@Autor Anderson Caio da Fonseca Santos
*/

public class Moto extends Veiculo
{
	//Atributos de uma Moto
	private String partida;
	private int cilindradas;
	/**
	 * Método construtor da classe
	 *
	 *Construtor 'super' herdado da classe Veiculo
	 *
	 *@param	String		marca_		marca do veiculo
	 *@param	String		modelo_		modelo do veiculo
	 *@param	String		placa_		placa do veiculo
	 *@param	String		partida_	tipo de partida
	 *@param	int		cilindradas_	cilindradas
	 */
	public Moto(String marca_, String modelo_, String placa_, String partida_, int cilindradas_)
	{
		super(marca_, modelo_, placa_);
		partida = partida_;
		cilindradas = cilindradas_;
	}

	/**
	 *Substitui a partida da moto pelo parametro passado
	 *
	 *@param	String		nova partida da moto
	 */

	public void setPartida(String p)
	{
		partida = p;
	}

	/**
	 *Substitui as cilindradas da moto pelo parametro passado
	 *
	 *@param	int		cilindradas da moto
	 */

	public void setCilindradas(int c)
	{
		cilindradas = c;
	}

	/**
	 *Retorna o tipo partida da moto
	 *
	 *@return	String		tipo de partida
	 */

	public String getPartida()
	{
		return partida;
	}
	
	/**
	 *Retorna as cilindradas da moto
	 *
	 *@return	int		cilindradas
	 */

	public int getCilindradas()
	{
		return cilindradas;
	}



}

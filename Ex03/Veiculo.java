/**
*
* Classe Veiculo
*
* Classe "pai" das classes "Carro" e "Moto"
*
* Classe destinada a definir os atributos de um Veiculo e 
* métodos para manipular esses atributos.
*
*@Autor Anderson Caio da Fonseca Santos
*/
public class Veiculo
{
	//Atributos de um Veiculo
	private String marca;
	private String modelo;
	private String placa;

	/**
	 * Método construtor da classe
	 *
	 *@param	marca_		marca do veiculo
	 *@param	modelo_		modelo do veiculo
	 *@param	placa_		placa do veiculo
	 */
	public Veiculo(String marca_, String modelo_, String placa_)
	{
		marca = marca_;
		modelo = modelo_;
		placa = placa_;
	}

	/**
	 *Substitui a marca do veiculo pelo parametro passado
	 *
	 *@param	String		nova marca do veiculo
	 */

	public void setMarca(String m)
	{
		marca = m;
	}
	
	/**
	 *Substitui o modelo do veiculo pelo parametro passado
	 *
	 *@param	String		novo modelo do veiculo
	 */

	public void setModelo(String m)
	{
		modelo = m;
	}

	/**
	 *Substitui a placa do veiculo pelo parametro passado
	 *
	 *@param	String		nova placa do veiculo
	 */

	public void setPlaca(String p)
	{
		placa = p;
	}
	
	/**
	 *Retorna a marca do veiculo
	 *
	 *@return	String		marca do veículo
	 */

	public String getMarca()
	{
		return marca;
	}

	/**
	 *Retorna o modelo do veiculo
	 *
	 *@return	String		modelo do veículo
	 */

	public String getModelo()
	{
		return modelo;
	}

	/**
	 *Retorna a placa do veiculo
	 *
	 *@return	String		placa do veículo
	 */

	public String getPlaca()
	{
		return placa;
	}








	
}

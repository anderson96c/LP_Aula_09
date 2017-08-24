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

import java.util.Calendar;

public class Veiculo
{
	//Atributos de um Veiculo
	private String marca;
	private String modelo;
	private String placa;
	private boolean alugado;
	private Calendar data;
	private Cliente cliente;
	 

	/**
	 * Método construtor da classe
	 *
	 *@param	String		marca_		marca do veiculo
	 *@param	String		modelo_		modelo do veiculo
	 *@param	String		placa_		placa do veiculo
	 */
	public Veiculo(String marca_, String modelo_, String placa_)
	{
		marca = marca_;
		modelo = modelo_;
		placa = placa_;
		alugado = false;
		data = null;
		cliente = new Cliente(null, 0);
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

	/**
	 * Substitui o estado de alugado do veiculo para o parametro passado
	 *
	 *@param	boolean		se o veiculo está ou nao alugado
	 */

	public void setAlugado(boolean b)
	{
		alugado = b;
	}

	/**
	 *@return	boolean		esta ou nao alugado
	 */

	public boolean isAlugado()
	{
		return alugado;
	}

	/**
	 *@return	String		Disponibilidade do veiculo
	 */

	public String diponibilidade()
	{
		if(alugado == true)
			return "Indisponível";
		else
			return "Disponível";
	}

	/**
	 * Substitui o cliente em posse veiculo para o parametro passado
	 *
	 *@param	Cliente		Cliente em posse do veículo
	 */

	public void setCliente(Cliente c)
	{
		cliente = c;
	}
	
	/**
	 * Retorna o cliente em posse do carro
	 *
	 *@return	Cliente		alugando o carro
	 */
	public Cliente getCliente()
	{
		return cliente;
	}

	/**
	 * Substitui a data que o veículo foi alugado para o parametro passado
	 *
	 *@param	Calendar	data do aluguel
	 */

	public void setData(Calendar d)
	{
		data = d;
	}

	public void print()
	{
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Placa: " + placa);
		System.out.println("Disponibilidade: " + diponibilidade());
	}








	
}

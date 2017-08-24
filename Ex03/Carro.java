/**
*
* Classe Carro
*
* Herdeira da classe "Veiculo"
*
* Adiciona os atributos 'potencia' e 'quantidade de portas'
* e métodos para manipular esses atributos
*
*@Autor Anderson Caio da Fonseca Santos
*/
public class Carro extends Veiculo
{
	//Atributos de um Carro
	private double potencia;
	private int portas;

	/**
	 * Método construtor da classe
	 *
	 *Construtor 'super' herdado da classe Veiculo
	 *
	 *@param	marca_		marca do veiculo
	 *@param	modelo_		modelo do veiculo
	 *@param	placa_		placa do veiculo
	 *@param	potencia_	potencia do carro
	 *@param	portas_		quantidade de portas do carro
	 */
	public Carro(String marca_, String modelo_, String placa_, double potencia_, int portas_)
	{
		super(marca_,modelo_,placa_);
		potencia = potencia_;
		portas = portas_;
	}

	/**
	 *Substitui a potencia do carro pelo parametro passado
	 *
	 *@param	double		nova potencia do carro
	 */

	public void setPotencia(double p)
	{
		potencia = p;
	}

	/**
	 *Substitui numero de portas do carro pelo parametro passado
	 *
	 *@param	int		nova numero de portas do carro
	 */

	public void setPortas(int p)
	{
		portas = p;
	}
	
	/**
	 *Retorna a potencia do carro
	 *
	 *@return	double		potencia do carro
	 */

	public double getPotencia()
	{
		return potencia;
	}

	/**
	 *Retorna a quantidade de portas do carro
	 *
	 *@return	int		quantidade de portas
	 */

	public int getPortas()
	{
		return portas;
	}






}

/**
*
* Classe Locadora
*
*
* Classe destinada a determinar uma lista de veiculos para aluguel
* registrar os alugueis feitos pelos clientes e os veículos alugados
*
*@Autor Anderson Caio da Fonseca Santos
*/
import java.util.ArrayList;
import java.util.Calendar;
	
public class Locadora
{
	//Lista de veiculos disponíveis
	ArrayList<Veiculo> veiculos;

	/**
	 *Método construtor da classe	
	 */
	public Locadora()
	{
		veiculos = new ArrayList<Veiculo>();
	}
	
	/**
	 *@return	Veiculo		veiculo localizado no index
	 */
	
	public Veiculo get(int index)
	{
		return veiculos.get(index);
	}
	
	/**
	 *@return	int	numero de veiculos da locadora
	 */
	public int size()
	{
		return veiculos.size();
	}
	
	/**
	 * Adiociona um veículo disponivel para aluguel
	 *
	 *@param	Veiculo		Veiculo a ser adicionado na lista
	 */
	public void addVeiculo(Veiculo v)
	{
		veiculos.add(v);
	}

	/**
	 *Mostra todos os veículos da lista
	 */

	public void showVeiculos()
	{
		for(int i = 0; i< veiculos.size(); i++)
		{
			veiculos.get(i).print();
			System.out.println();
		}
		
	}

	/**
	 *Mostra todos os veiculos alugados
	 */

	public void showAlugados()
	{
		for(int i = 0; i< veiculos.size(); i++)
		{
			if(veiculos.get(i).isAlugado())
			{
				veiculos.get(i).print();
				System.out.println();
			}
		}
	}

	/**
	 *Mostra todos os veiculos disponiveis para aluguel
	 */

	public void showDisponiveis()
	{
		for(int i = 0; i< veiculos.size(); i++)
		{
			if(!veiculos.get(i).isAlugado())
			{
				veiculos.get(i).print();
				System.out.println();
			}
		}
		
	}

	/**
	 * Realiza o aluguel de um veiculo
	 *
	 *@param	Cliente		cliente alugando o veiculo
	 *@parem	Veiculo		veiculo a ser alugado
	 */

	public void alugar(Cliente c, Veiculo v)
	{
		if(v.isAlugado())
			System.out.println("O veiculo já está alugado");

		else
		{	
			v.setCliente(c);
			v.setAlugado(true);
			Calendar d = Calendar.getInstance();
			v.setData(d);
		}
	}

	/**
	 *Imprime o recibo do aluguel
	 *
	 *@param	Veiculo		veiculo do qual o recibo se refere
	 */

	public void imprimirRecibo(Veiculo v)
	{
		if(!v.isAlugado())
			System.out.println("Este veiculo nao foi alugado");
		else
		{
		System.out.println("Alugado por: " + v.getCliente().getNome());
		System.out.println("Modelo: " + v.getModelo());
		}
	}

	
}

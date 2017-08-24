/**
*
* Classe Main
*
* Classe destinada a testar as funcionalidades das classes
* Veiculo, Carro, Moto, Cliente e Locadora.
*
*
*@Autor Anderson Caio da Fonseca Santos
*/

public class Main
{
	public static void main(String [] args)
	{
		Locadora loc = new Locadora();
		
		//Instanciando motos
		Moto moto1 = new Moto("Honda", "150", "EHD457", "Manual", 100);
		Moto moto2 = new Moto("Yamaha", "Crosser", "LFO846", "Eletrica", 150);
		Moto moto3 = new Moto("Suzuki", "Bandit 650 S", "IED981", "Eletrica", 200);
		//Instanciando carros
		Carro carro1 = new Carro("Fiat", "Uno", "OEU647", 1.3, 4);
		Carro carro2 = new Carro("Ford", "New Fiesta", "YRT258", 1.6, 4);
		Carro carro3 = new Carro("Citroen", "C3", "PUB420", 1.2, 4);
		//Instanciando Clientes
		Cliente cliente1 = new Cliente("Cliente1", 1234);
		Cliente cliente2 = new Cliente("Cliente2", 5678);
		Cliente cliente3 = new Cliente("Cliente3", 1928);
		
		//Adicionando carros à locadora
		loc.addVeiculo(moto1);
		loc.addVeiculo(moto2);
		loc.addVeiculo(moto3);
		loc.addVeiculo(carro1);
		loc.addVeiculo(carro2);
		loc.addVeiculo(carro3);

		loc.showDisponiveis();
		
		System.out.println("Alugando 3 veiculos...");
		loc.alugar(cliente1, carro2);
		loc.alugar(cliente2, moto3);
		loc.alugar(cliente3, carro1);

		loc.showVeiculos();
		for(int i = 0; i < loc.size(); i++)
		{
			loc.imprimirRecibo(loc.get(i));
			System.out.println();
		}
	}
}

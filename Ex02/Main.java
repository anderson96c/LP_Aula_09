
public class Main
{
	public static void main(String [] args)
	{	

		Deposito deposit = new Deposito();
		
		Pizza pizza1 = new Pizza("Moda da casa", 35.00, "Domino's", "Indescritivel!", "23/08/2017", "24/08/2017", "Alimenticio",
					 "Calabresa, Frango, Carne, Cheddar e Catupiry", 12);

		Chocolate chocolate1 = new Chocolate("Laka", 4.50, "Lacta", "Chocolate Branco", "16/05/2017", "16/11/2017", "Alimenticio",
						     "Branco", 24);

		Refrigerante refri1 = new Refrigerante("Coca-Cola", 6.00, "Coca-Cola", "Pode conter coisas que te matem lentamente por 								dentro", "23/08/2017", "23/08/2019", "Alimenticio", "Cola", 2.5);

		Carro carro1 = new Carro("Uninho da firma", 8500.00, "Fiat", "Com uma escada pode chegar próximo à velocidade da luz", 						 "2001", "Metal", 30, "Uno", 450.6);

		Livro livro1 = new Livro("O nome do vento", 50.00, "Arqueiro", "Simplesmente épico!", "2007", "Papel", 50, 656);

		Celular celular1 = new Celular("Galaxy S8", 2800.00, "Samsung", "...", "2017", "Metal", 5, "Oi");

		if(deposit.isEmpty())
			System.out.println("O depósito está vazio!");

		else
			System.out.println("Há itens no depósito!");

		System.out.println("Adicionando itens ao depósito...");		

		deposit.addItem(pizza1);
		deposit.addItem(chocolate1);
		deposit.addItem(refri1);
		deposit.addItem(carro1);	
		deposit.addItem(livro1);
		deposit.addItem(celular1);
		
		if(deposit.isEmpty())
			System.out.println("O depósito está vazio!");

		else
			System.out.println("Há itens no depósito!");

		
	
	}
}

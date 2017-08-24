
public class Main
{
	public static void main(String [] args)
	{	
		Date hoje = new Date(23, 8,2017);
		Date validade = new Date(13, 9, 2018);
		Pizza pizza1 = new Pizza("Moda da casa", 35.00, "Domino's", "Indescritivel!", hoje, validade, "Alimenticio",
					 "Calabresa, Frango, Carne, Cheddar e Catupiry", 12);

		Deposito deposit = new Deposito();

		deposit.addItem(pizza1);

		System.out.println("Data de fabricação da pizza: " + pizza1.getDataVal().day + "/" + pizza1.getDataVal().month + 
				   "/" + pizza1.getDataVal().year);	
	}
}

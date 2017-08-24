/**
*
*
* Classe Main destinada a testar as funções das classes "Professor"
* "ProfessorRegime" e "ProfessorHorista".
*
*@Autor Anderson Caio da Fonseca Santos
*
*/
public class Main
{
	public static void main(String [] args)
	{
		//Instaciando um professor de cada classe
		Professor p1 = new Professor("P1", "001", 42);
		ProfessorRegime p2 = new ProfessorRegime("P2", "002", 27, 1000);
		ProfessorHorista p3 = new ProfessorHorista("P3", "003", 30, 160, 8.50);
		
		//Checando se foi construido corretamente
		p1.print();
		
		//Utilizando métodos
		p1.setNome("NomeMudado1");
		p1.setMatricula("00001");
		p1.setIdade(40);

		//Checando resultado dos métodos
		p1.print();
		
		//Checando segundo professor
		p2.print();

		//Testando método getSalario do ProfessorRegime
		double salarioP2 = p2.getSalario();
		System.out.println("SalarioP2 : " + salarioP2);
		
		//Testando setSalario
		p2.setSalario(2000);
		System.out.println("Novo salarioP2 : " + salarioP2);

		//Verificando ProfessorHorista
		p3.print();

		//Testando metodo getSalario do ProfessorHorista
		double salarioP3 = p3.getSalario();
		System.out.println("SalarioP3 : " + salarioP3);
		
		//Testando métodos
		p3.setNome("NomeMudade3");
		p3.setMatricula("00003");
		p3.setIdade(33);
		p3.setTotalHoras(200);
		p3.setSalarioHora(9.30);
		
		//Checando resultados
		p3.print();
		salarioP3 = p3.getSalario();
		System.out.println("SalarioP3 : " + salarioP3);

		
		

		
	}
}

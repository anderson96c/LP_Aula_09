
public class Main
{
	public static void main(String [] args)
	{
		Professor p1 = new Professor("P1", "001", 42);
		ProfessorRegime p2 = new ProfessorRegime("P2", "002", 27, 1000);
		ProfessorHorista p3 = new ProfessorHorista("P3", "003", 30, 160, 8.50);

		p1.print();

		p1.setNome("NomeMudado1");
		p1.setMatricula("00001");
		p1.setIdade(40);

		p1.print();
		
		p2.print();

		double salarioP2 = p2.getSalario();
		System.out.println("SalarioP2 : " + salarioP2);

		p3.print();
		double salarioP3 = p3.getSalario();
		System.out.println("SalarioP3 : " + salarioP3);

		p3.setNome("NomeMudade3");
		p3.setMatricula("00003");
		p3.setIdade(33);
		p3.setTotalHoras(200);
		p3.setSalarioHora(9.30);
		
		p3.print();
		salarioP3 = p3.getSalario();
		System.out.println("SalarioP3 : " + salarioP3);

		
		

		
	}
}

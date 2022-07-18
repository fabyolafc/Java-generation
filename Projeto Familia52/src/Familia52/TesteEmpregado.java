package Familia52;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado[] lista = new Empregado[3];
		lista[0] = new Empregado("David Lucas Mendes",5000);
		lista[1] = new Empregado("Cristiano",10000);
		lista[2] = new Empregado("Ismael Lopes",20000);
		
		for(Empregado roda:lista)
		{
			roda.imprimir();
		}
		
		System.out.println("**************************************");
		for(Empregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}

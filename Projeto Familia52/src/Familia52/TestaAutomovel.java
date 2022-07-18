package Familia52;

public class TestaAutomovel {

	public static void main(String[] args) {
		
		//instanciando um objeto da classe Automovel
		Automovel auto1 = new Automovel("Luciana Rocha","Mazda","LD2019",2023);
		
		auto1.imprimirInfo();
		System.out.println("\n*************Transferência de Proprietarie*************");
		auto1.setNomeProprietario("Tacio Ferreira");
		auto1.imprimirInfo();

	}

}

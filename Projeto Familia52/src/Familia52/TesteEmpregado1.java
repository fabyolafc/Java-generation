package Familia52;

public class TesteEmpregado1 {

	public static void main(String[] args) {
		
		Empregado1 empregado = new Empregado1("Paulo Victor","rua da Marola,100","12345678912",
				948484848,22,123,42000.50f,15);
		empregado.imprimirInfo();
		empregado.calcularSalario();

	}

}

package ProjetoJava;
/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		double consumidor, fabrica, distribuidor, impostos;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nCusto de f�brica:");
		fabrica = leia.nextFloat();
		
		distribuidor = (fabrica * 28.0) / 100.0;
		impostos = (fabrica * 45.0) / 100;

		consumidor = (distribuidor + impostos);
		System.out.println("O custo de um carro novo �: " + consumidor + " reais");

	}

}
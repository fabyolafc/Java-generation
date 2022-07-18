package ProjetoJava;
/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		double consumidor, fabrica, distribuidor, impostos;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nCusto de fábrica:");
		fabrica = leia.nextFloat();
		
		distribuidor = (fabrica * 28.0) / 100.0;
		impostos = (fabrica * 45.0) / 100;

		consumidor = (distribuidor + impostos);
		System.out.println("O custo de um carro novo é: " + consumidor + " reais");

	}

}
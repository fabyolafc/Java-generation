package ProjetoJava;
/*4 Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		double n;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n = leia.nextFloat();
		
		if(n%2==0) {
			System.out.printf("O número digitado é par e sua raiz quadrada é: %2.2f", Math.sqrt(n));
		} else {
			System.out.println("O número digitado é impar e elevado ao quadrado é: " + Math.pow(n, 2));
		}
	}

}
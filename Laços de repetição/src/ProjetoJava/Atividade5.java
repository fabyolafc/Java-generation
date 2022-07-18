package ProjetoJava;
/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		int numero=0, somaDosNumeros=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número ");
			numero = leia.nextInt();
			somaDosNumeros+=numero;
		}while(numero != 0);
		System.out.println("\nSoma dos números digitados "+somaDosNumeros);
	}

}

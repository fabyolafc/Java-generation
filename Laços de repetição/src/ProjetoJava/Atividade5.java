package ProjetoJava;
/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		int numero=0, somaDosNumeros=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um n�mero ");
			numero = leia.nextInt();
			somaDosNumeros+=numero;
		}while(numero != 0);
		System.out.println("\nSoma dos n�meros digitados "+somaDosNumeros);
	}

}

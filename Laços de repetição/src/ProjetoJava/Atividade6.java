package ProjetoJava;
/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números mulltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		int numero, quant=0, soma=0;
		float  media=0;
	
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número inteiro ");
			numero = leia.nextInt();
			if (numero%3==0) {
				soma+=numero;
				quant++;
				media = soma/quant;
			}
		}while(numero != 0);
		System.out.println("\nMédia dos números multiplos de três "+media);
	}

}

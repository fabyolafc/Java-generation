package ProjetoJava;
/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros mulltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		int numero, quant=0, soma=0;
		float  media=0;
	
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um n�mero inteiro ");
			numero = leia.nextInt();
			if (numero%3==0) {
				soma+=numero;
				quant++;
				media = soma/quant;
			}
		}while(numero != 0);
		System.out.println("\nM�dia dos n�meros multiplos de tr�s "+media);
	}

}

package ProjetoJava;
/*1 Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		int a,b,c,maiorValor;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o valor de A:");
		a = leia.nextInt();
		System.out.println("\nDigite o valor de B:");
		b = leia.nextInt();
		System.out.println("\nDigite o valor de C:");
		c = leia.nextInt();
		
		if(a>c && a>b) {
			System.out.println("O maior n�mero � o: "+a);
		} else if(b>a && b>c) {
			System.out.println("O maior n�mero � o: "+b);
		} else {
			System.out.println("O maior n�mero � o: "+c);		
		}
	}
}

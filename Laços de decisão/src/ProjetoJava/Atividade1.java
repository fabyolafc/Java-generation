package ProjetoJava;
/*1 Faça um programa que receba três inteiros e diga qual deles é o maior.*/
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
			System.out.println("O maior número é o: "+a);
		} else if(b>a && b>c) {
			System.out.println("O maior número é o: "+b);
		} else {
			System.out.println("O maior número é o: "+c);		
		}
	}
}

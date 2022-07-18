package ProjetoJava;
/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		int a, b, c, d, r, s, AB, BC;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um valor para A");
		a = leia.nextInt();
		System.out.println("\nDigite um valor para B");
		b = leia.nextInt();
		System.out.println("\nDigite um valor para C");
		c = leia.nextInt();
		
		AB = a+b;
		BC = b+c;

		r = AB*AB;
		s = BC*BC;

		d = (r + s)/2;

		System.out.println("O valor de D é: " + d);

	}

}
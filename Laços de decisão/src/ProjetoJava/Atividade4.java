package ProjetoJava;
/*4 Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		double n;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		n = leia.nextFloat();
		
		if(n%2==0) {
			System.out.printf("O n�mero digitado � par e sua raiz quadrada �: %2.2f", Math.sqrt(n));
		} else {
			System.out.println("O n�mero digitado � impar e elevado ao quadrado �: " + Math.pow(n, 2));
		}
	}

}
package ProjetoJava;
/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int x, quantPar=0, quantImpar=0, numero;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++) {
			System.out.println("\nDigite um n�mero:");
			numero = leia.nextInt();
			
			if(numero%2==0)
			{
				quantPar++;
			}
			else
			{
				quantImpar++;
			}
		}	
		System.out.println("\nQuantidade de n�meros pares: "+quantPar);
		System.out.println("\nQuantidade de n�meros �mpares: "+quantImpar);
	}
}

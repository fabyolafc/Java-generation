package ProjetoJava;
/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
• Os n�meros pares digitados;  
• A soma dos n�meros pares digitados; 
• Os n�meros �mpares digitados; 
• A quantidade de n�meros �mpares digitados.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int [] numero = new int[6];
		int x, somaPar=0, somaImpar=0;
		List<Integer> numerosImpares = new ArrayList<>();
		List<Integer> numerosPares = new ArrayList<>();
				
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<6; x++) {
			System.out.printf("Digite o valor de [%d] = ", x+1);
			numero[x] = leia.nextInt();
			
			if(numero[x]%2==0) {
				numerosPares.add(numero[x]);
				somaPar+=numero[x];
			}else {
				numerosImpares.add(numero[x]);
				somaImpar++;
			}
		}
		System.out.println("Os n�meros pares digitados "+numerosPares);
		System.out.println("A soma dos n�meros pares digitados "+somaPar);
		System.out.println("Os n�meros �mpares digitados "+numerosImpares);
		System.out.println("A quantidade de n�meros �mpares digitados "+somaImpar);
	}

}

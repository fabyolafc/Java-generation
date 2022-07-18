package ProjetoJava;
/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int[][] numero = new int[3][3];
		int l,c,contador=0;
		Scanner leia = new Scanner(System.in);

		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.printf("Digite o valor de [%d][%d] = ", l+1, c+1);
				numero[l][c] = leia.nextInt();
				
				if(numero[l][c]>10) {
					contador++;
				}
				
			}
		}
		System.out.println("\nA quantidade de valores maiores que dez: "+contador);
	}

}

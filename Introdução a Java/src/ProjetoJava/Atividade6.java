package ProjetoJava;
/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula
que efetua tal c�lculo �:*/
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		double d, x1, x2, y1, y2;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com o valor de X1:");
		x1 = leia.nextFloat();
		System.out.println("\nEntre com o valor de X2:");
		x2 = leia.nextFloat();
		System.out.println("\nEntre com o valor de Y1:");
		y1 = leia.nextFloat();
		System.out.println("\nEntre com o valor de Y2:");
		y2 = leia.nextFloat();
		
		d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.printf("\nAdist�ncia entre os dois pontos foi de: %.2f",d);

	}

}
package ProjetoJava;
/*7. Um sistema de equações lineares do tipo:
, pode ser resolvido segundo mostrado abaixo :
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/
import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		float A, B, C, D, E, F, x, y;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nO valor de A:");
		A = leia.nextFloat();
		System.out.println("\nO valor de B:");
		B = leia.nextFloat();
		System.out.println("\nO valor de C:");
		C = leia.nextFloat();
		System.out.println("\nO valor de D:");
		D = leia.nextFloat();
		System.out.println("\nO valor de E:");
		E = leia.nextFloat();
		System.out.println("\nO valor de F:");
		F = leia.nextFloat();
		
		x = ((C*E)-(B*F))/((A*E)-(B*D));
		y = ((A*F)-(C*D))/((A*E)-(B*D));

		System.out.println("O valor de X é: "+x+ " o valor de Y é: "+y);
	}

}
package ProjetoJava;
/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/
import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		int nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite a 1� nota");
		nota1 = leia.nextInt();
		System.out.println("\nDigite a 2� nota");
		nota2 = leia.nextInt();
		System.out.println("\nDigite a 3� nota");
		nota3 = leia.nextInt();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/10;

		System.out.println("O valor da media �: " + media);

	}

}
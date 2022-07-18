package ProjetoJava;
/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/
import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		int nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite a 1ª nota");
		nota1 = leia.nextInt();
		System.out.println("\nDigite a 2ª nota");
		nota2 = leia.nextInt();
		System.out.println("\nDigite a 3ª nota");
		nota3 = leia.nextInt();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/10;

		System.out.println("O valor da media é: " + media);

	}

}
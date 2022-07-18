package ProjetoJava;
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		int idade_anos, idade_meses, anos, meses, dias, total_dias;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite sua idade: ");
		anos = leia.nextInt();
		System.out.println("\nDigite quantos meses: ");
		meses = leia.nextInt();
		System.out.println("\nDigite quantos dias: ");
		dias = leia.nextInt();
		
		idade_anos = 365;
		idade_meses = 30;

		total_dias = (anos * idade_anos) + (meses * idade_meses) + dias;
		
		System.out.println("\nO total de dias é");
		System.out.println(total_dias);
	}
}
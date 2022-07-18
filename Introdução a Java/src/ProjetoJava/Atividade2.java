package ProjetoJava;
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int ano, meses, dias, dia;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite sua idade em dias: ");
		dias = leia.nextInt();
		
		ano = dias / 365;
		meses = (dias % 365) / 30;
		dia = (dias % 365) % 30;
		
		System.out.println("A idade em anos, meses e dias é "+ ano + meses + dia);
	}
}
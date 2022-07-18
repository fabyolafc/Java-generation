package Familia52;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {

	public static int quociente(int numerador, int denominador) throws ArithmeticException
	{
		return numerador / denominador;
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		boolean continueLoop = true;
		
		do
		{
			try // ler dois n�meros e calcular o quociente
			{
				System.out.println("\nEntre com o numerador: ");
				int numerador = ler.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = ler.nextInt();
				int resultado = quociente(numerador,denominador);
				System.out.printf("\nResultado: %d / %d = %d \n",numerador,denominador,resultado);
				continueLoop = false;
			}
			catch(InputMismatchException inputMismatchException )
			{
				System.err.printf("\nExce��o: %s\n\n",inputMismatchException);
				ler.nextLine();
				System.out.println("\n\nVoc� deve entrar com um valor do tipo inteiro..."
						+ "Por favor, tente novamente...");
			}
			catch(ArithmeticException arithmeticException )
			{
				System.err.printf("\n\nExce��o: %s\n\n",arithmeticException);
				System.out.println("\n\nZero � um denominador inv�lido. Por favor, tente novamente...");
				
			}
		}
		while(continueLoop);

	}

}

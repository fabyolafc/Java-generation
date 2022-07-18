package Familia52;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		int num,quantPar=0,quantImpar=0;
		Scanner leia = new Scanner(System.in);
		do
		{
			System.out.println("\nEntre com um número com um número inteiro: ");
			num = leia.nextInt();
			if(num%2==0)
			{
				quantPar++;
			}
			else
			{
				quantImpar++;
			}
			
		}
		while(quantPar!=3);
		System.out.println("\nQuantidade de números pares: "+quantPar);
		System.out.println("\nQuantidade de números ímpares: "+quantImpar);

	}

}

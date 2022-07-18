package Familia52;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		float num,somaNum=0,quantNum=0;
		float mediaNum ;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um número inteiro ou 0 para sair: ");
		num = ler.nextFloat();//1
		while(num!=0)
		{
			somaNum +=num;
			quantNum++;
			System.out.println("\nEntre com um número inteiro ou 0 para sair: ");
			num = ler.nextFloat();
		}
		if(quantNum==0)
		{
			System.out.println("\nNão é possível fazer uma divisão por zero!!!");
		}
		else
		{
		mediaNum = somaNum / quantNum;
		System.out.printf("\nMédia dos números lidos foi de: %.2f",mediaNum);
		}

	}

}

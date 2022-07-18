package Familia52;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		float n1,n2,n3,media,mediaGeral,somaMedia=0;
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<4;x++)
		{
			System.out.println("\nEntre com a primeira nota: ");
			n1 = ler.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = ler.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = ler.nextFloat();
			
			media = (n1+n2+n3)/3;
			System.out.printf("\nMédia alune %d: %.2f",x+1,media);
			for(x=0;x<20;x++)
			{
				System.out.println("\n");
			}
			somaMedia +=media;
		}
		mediaGeral = somaMedia / 4;
		System.out.printf("\nMédia geral: %.2f",mediaGeral);

	}

}

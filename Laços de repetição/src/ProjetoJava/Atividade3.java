package ProjetoJava;
/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int idade=0, total1=0, total2=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("\nDigite sua idade ");
			idade = leia.nextInt();	
			
			if (idade>=1 && idade <=21) {
				total1++;
				
			}else if(idade>=50) {
				total2++;
				
			}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos "+total1);
		System.out.println("\nTotal de pessoas com mais de 50 anos "+total2);
	}

}

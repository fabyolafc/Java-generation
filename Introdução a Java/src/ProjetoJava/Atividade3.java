package ProjetoJava;
/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int totalSegundos, hora, minuto, segundo;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nQuantidade de segundos que durou o evento: ");
		totalSegundos = leia.nextInt();

		hora = totalSegundos / 3600;
		minuto = (totalSegundos % 3600) / 60;
		segundo = (totalSegundos % 3600) % 60;
		
		System.out.println("O evento durou: " + hora + " hora(s) " + minuto + " minuto(s) " + segundo + " segundo(s)");
	}

}
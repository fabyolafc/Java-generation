package ProjetoJava;
/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
*/
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
	
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		float numero;
		int i,j,op;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nEntre com os valores da matriz1: ");
				matriz1[i][j]=leia.nextFloat();
				System.out.println("\nEntre com os valores da matriz2: ");
				matriz2[i][j]=leia.nextFloat();
			}
		}
		do {
			System.out.println("\n\t\tMenu de op��es");
			System.out.println("\n1-Somar as duas matrizes");
			System.out.println("\n2-Subtrair a primeira matriz da segunda matriz");
			System.out.println("\n3-Adicionar uma vari�vel as duas matrizes");
			System.out.println("\n4-Imprimir as matrizes");
			System.out.println("\n0-Sair do programa");
			System.out.println("\nDigite sua op��o: ");
			op=leia.nextInt();
			
			switch(op)
			{
			case 1:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
						System.out.println("\nSoma das matrizes: "+matriz3[i][j]);
					}
				}
			break;
			case 2:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j]=matriz2[i][j]-matriz1[i][j];
						System.out.println("\nSubtra��o das matrizes: "+matriz3[i][j]);
					}
				}
			break;
			case 3:
				System.out.println("\nEntre com o valor:");
				numero=leia.nextFloat();
					for(i=0;i<2;i++) {
						for(j=0;j<2;j++) {
							matriz1[i][j]+=numero;
							matriz2[i][j]+=numero;
							System.out.println("\nMatriz: "+matriz1[i][j]);
							System.out.println("\nMatriz: "+matriz2[i][j]);
					}
				}
			break;
			case 4:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.println("\nMatriz: "+matriz1[i][j]);
						System.out.println("\nMatriz: "+matriz2[i][j]);
				}
			}
			break;
			case 0:
				System.out.println("\nMuito obrigado por utilizar do nosso programa, volte sempre!!!");
			break;
			default:
				System.out.println("\nOp��o inv�lida!!!");				
			}			
		}while(op!=0);

	}

}

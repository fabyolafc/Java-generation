package ProjetoJava;
/*4- Uma empresa desenvolveu uma pesquisa para saber as caracterásticas
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
ï‚· o número de pessoas calmas;
ï‚· o número de mulheres nervosas;
ï‚· o número de homens agressivos;
ï‚· o número de outros calmos;
ï‚· o número de pessoas nervosas com mais de 40 anos;
ï‚· o número de pessoas calmas com menos de 18 anos.*/
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		int idade, genero, fp, contpc=0, contmn=0, contha=0, contnbc=0, contpn40=0, contpc18=0, x=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=5) {
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while(idade<1 || idade>130) {
				System.out.println("\nIdade inexistente, por favor entre com a sua idade: ");
				idade = leia.nextInt();
			}
			System.out.println("\nEntre com o seu gênero: \n1-Feminino\n2-Masculino\n3-Não binário ");
			genero = leia.nextInt();
			while(genero<1 || genero>3) {
				System.out.println("\nGênero inválido...Entre com o seu gênero: \n1-Feminino\n2-Masculino\n3-Não binário ");
				genero = leia.nextInt();
			}
			System.out.println("\nEntre com a seu fator psicológico: \n1-Pessoa Calma\n2-Pessoa Nervosa\n3-Pessoa Agressiva ");
			fp = leia.nextInt();
			while(fp<1 || fp>3) {
				System.out.println("\nFtor psicológico inválido...Entre com a seu fator psicolgico: \n1-Pessoa Calma\n2-Pessoa Nervosa\n3-Pessoa Agressiva ");
				fp = leia.nextInt();
			}
			if (fp==1) {
				contpc++;
			}
			if (genero==1 && genero==2) {
				contmn++;
			}
			if (genero==2 && fp==3) {
				contha++;
			}
			if(genero==3 && fp==1) {
				contnbc++;
			}
			if(fp==2 && idade>40) {
				contpn40++;
			}
			if (fp==1 && idade<18) {
				contpc18++;
			}
			x++;
		}
		System.out.println("\nQuantidade de pessoas calmas: "+contpc);
		System.out.println("\nQuantidade de mulheres nervosas: "+contmn);
		System.out.println("\nQuantidade de homens agressivos: "+contha);
		System.out.println("\nQuantidade de binários calmo: "+contnbc);
		System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: "+contpc18);
	}
}

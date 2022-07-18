package Familia52;

public class Operarie extends Pessoa{

	private double valorProducao;
	private double comissao;
	
	public Operarie(String nome,String endereco,String cpf,int telefone,
			int idade,double valorProducao,double comissao)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorProducao=valorProducao;
		this.comissao=comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do operarie: "+getNome()+"\nCPF:"+getCpf()+
				"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+
				"\nEndereço: "+getEndereco()+"\nValor monetário total dos artigos produzidos: "+valorProducao+
				"\nPorcentagem (sem %) da comissão deste artigo: "+comissao);
	}
	
	public void calcularValorArtigo()
	{
		double valorTotal = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\nO valor total a ser recebido pelo operário "+getNome()+
				" é igual a: "+valorTotal);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}

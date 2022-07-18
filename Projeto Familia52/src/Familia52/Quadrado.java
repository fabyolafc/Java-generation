package Familia52;

public class Quadrado extends BaseFigura implements Figuras {

	Quadrado(double lado, String nome)
	{
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
	}
	
	public double getDiagonal()
	{
		return Math.sqrt(2)*lado1;
	}
}

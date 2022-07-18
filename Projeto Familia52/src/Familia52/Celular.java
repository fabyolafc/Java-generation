package Familia52;

public class Celular extends Telefone {

	public Celular()
	{
		super("Telefone Celular");
	}
	@Override
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("\nRing...ring...ring");
			break;
		case 2:
			System.out.println("\nTantann�...n�n�n�n�");
			break;
		default:
			System.out.println("\nDingdong...dingdong...");
			
		}
	}
	@Override
	public void disca(String numero)
	{
		System.out.println("\nO n�mero: "+numero+" � um celular...");
	}
}


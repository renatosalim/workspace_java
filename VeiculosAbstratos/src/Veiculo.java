
public abstract class Veiculo {
	protected String marca;
	protected int    ano;
	
	public Veiculo(String marca, int ano) {
		super();
		this.marca = marca;
		this.ano = ano;
	}
	
	/* com classes abstratas, apesar de "n�o poder dar new no objeto" eu consigo
	 * criar "cl�usulas contratuais", de modo que meus descendentes sejam obrigados
	 * a implementar a l�gica destes m�todos
	*/
	 
	public abstract void acelerar();
	public abstract void frear();

}

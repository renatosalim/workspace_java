package Modelo;

public class Empreiteiro extends Funcionário {
	
	protected Float valorEmpreita;

	public Empreiteiro(String nome, Int numeroRegistro, Float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
		
		
	}

	public Float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(Float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	

}

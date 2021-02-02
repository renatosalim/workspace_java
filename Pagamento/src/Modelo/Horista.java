package Modelo;

public class Horista extends Funcionário {
	
	protected Float valorHora;
	protected Float numeroHoras;
	
	public Horista(String nome, Int numeroRegistro, Float valorHora, Float numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
		
		
	}

	public Float getValorHora() {
		return valorHora;
	}

	public void setValorHora(Float valorHora) {
		this.valorHora = valorHora;
	}

	public Float getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(Float numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	
	
	
}

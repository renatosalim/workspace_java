package Modelo;

public class Funcion�rio {

	protected String nome;
	protected Int numeroRegistro;

	public Funcion�rio(String nome, Int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(Int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
}

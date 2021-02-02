package Modelo;

public class Comissionado extends Funcionário {
	
	protected Float salarioBase;
	protected Float comissao;
	
	public Comissionado(String nome, Int numeroRegistro, Float salarioBase, Float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		
		
	}

	public Float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Float getComissao() {
		return comissao;
	}

	public void setComissao(Float comissao) {
		this.comissao = comissao;
	}
	
	
	
	

}

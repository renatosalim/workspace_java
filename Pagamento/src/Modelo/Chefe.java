package Modelo;

public class Chefe extends Funcionário {
	
	protected Float salarioBase;
	protected Float adicionalFuncao;
	protected Float beneficioTerno;
	
	public Chefe(String nome, Int numeroRegistro, Float salarioBase, Float adicionalFuncao, Float beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
		
		
	}

	public Float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(Float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public Float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(Float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
	

}

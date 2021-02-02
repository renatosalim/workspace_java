  
/* Neste caso, a classe CARRO n�o ter� m�todo MAIN
 * ela ser� apenas uma estrutura que cont�m uma s�rie de vari�veis (atributos)
 * para armazenar todas as informa��es correspondentes a um carro
 * 
 * O que isso implica? Estamos criando um novo tipo de dado!!!
 * 
 */


public class Carro {
	// aqui basta criar v�rias vari�veis (atributos)
	String marca;
	String modelo;
	int    ano;
	String cor;
	double preco;
	
	void exibirAnuncio(){
		System.out.println("---- Anuncio do isiCarros");
		System.out.println(" Carro : "+marca+ "  "+modelo+"/"+ano );
		System.out.println(" Cor   : "+cor);
		System.out.println(" Preco : R$ "+preco);
	}
	
	double calcularIPVA(){
		double valorIPVA;
		if (ano < 2000) {
			valorIPVA = 0.0;
		}
		else {
		    valorIPVA = preco * 0.04;	
		}
		return valorIPVA;
	}
	
	double calcularNovoPrecoComDesconto(double desconto) {
		double novoPreco = preco - preco * desconto / 100;
		return novoPreco;
	}
}
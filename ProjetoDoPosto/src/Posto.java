import java.util.Scanner;

public class Posto {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numCombustivel;
		double valor;
		int opcao;
		/* vers�o 3.0 - e se precis�ssemos criar v�rias bombas, por�m ter v�rias vari�veis
		 * do tipo Bomba seria invi�vel
		 * Vamos tentar falar de "vetores"
		 * 
		 */
		
		 /* lista[] = conjunto
		  * lista = new BombaDeCombustivel[4], � como se eu tivesse b0, b1, b2, b3;
		  *  	
		  * lista[0] ==> b0
		  * lista[1] ==> b1
		  * lista[2] ==> b2
		  * lista[3] ==> b3
		  * 
		  * lista[numCombustive] = bNumCombustivel
		  * 
		  * b0       = new BombaDeCombustivel("Etanol",2.999);
		  * lista[0] = new BombaDeCombustivel("Etanol",2.999);
		  * 
		  */
		
		BombaDeCombustivel lista[];  // � o equivalente a ter BombaDeCombustivel b1, b2, b3...;
		
		lista = new BombaDeCombustivel[4]; // acabei de criar um vetor de tamanho 4 do tipo BombaDeCombustivel
		                                   // o que significa? Que eu tenho uma lista de 4 posi��es
										   // equivalente a ter 4 vari�veis do tipo Bomba
		
		// proximo passo - s� tenho o tamanho do vetor, preciso agora dos objetos
		lista[0] = new BombaDeCombustivel("Etanol", 2.799);
		lista[1] = new BombaDeCombustivel("Gasolina Comum", 3.999);
		lista[2] = new BombaDeCombustivel("Gasolina Aditivada", 4.199);
		lista[3] = new BombaDeCombustivel("Diesel", 2.999);
		
		do {
			System.out.println("Selecione seu combustivel 0-3");
			numCombustivel = teclado.nextInt();
			if (numCombustivel >= 0 && numCombustivel <= 3) {
				System.out.println("Combustivel selecionado = "+
			                          lista[numCombustivel].getNomeCombustivel() +
			                          " Pre�o Litro R$ " +
			                          lista[numCombustivel].getPrecoLitro());
				System.out.println("Digite 1 - abastecer por litros / 2 - abastecer por valor");
				opcao = teclado.nextInt();
				if (opcao == 1) {
					System.out.println("Selecionou abastecer por litros");
					System.out.print("Quantos litros? "); 
					valor = teclado.nextDouble();
					lista[numCombustivel].abastecerPorLitros(valor);
					System.out.println(lista[numCombustivel].exibirRecibo());
				}
				else if (opcao == 2) {
					System.out.println("Selecionou abastecer por valor");
					System.out.print("Qual valor? ");
					valor = teclado.nextDouble();
					lista[numCombustivel].abastecerPorValor(valor);
					System.out.println(lista[numCombustivel].exibirRecibo());
				}
				else {
					System.out.println("Op��o invalida!!!");
				}
			}
			else if (numCombustivel > 3 || numCombustivel < -1) {
				System.out.println("Combust�vel Invalido");
			}
			
		} while (numCombustivel != -1);
		
		//--------------------------------------------------------------------------------
		/* versao 2.0 - agora com interface gr�fica
		 * trocar o System.out.println por JOptionPane.showMessageDialog
		 * NOTEM QUE: A CLASSE BOMBA DE COMBUST�VEL N�O VAI SOFRER NENHUMA ALTERA��O
		
		BombaDeCombustivel b1 = new BombaDeCombustivel("Gasolina Podium", 6.799);
		
		b1.abastecerPorLitros(80);
		JOptionPane.showMessageDialog(null, b1.exibirRecibo());
		
		b1.abastecerPorValor(30.00);
		JOptionPane.showMessageDialog(null, b1.exibirRecibo(),
									"RECIBO", JOptionPane.PLAIN_MESSAGE);
		
		
		/* Versao 1.0 - tudo via terminal 
		
		b1.abastecerPorLitros(80);
		System.out.println(b1.exibirRecibo());
		
		b1.abastecerPorValor(30);
		System.out.println(b1.exibirRecibo());
		*/
	}

}
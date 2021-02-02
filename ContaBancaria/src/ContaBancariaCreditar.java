import java.util.Scanner;

public class ContaBancariaCreditar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria c1  = new ContaBancaria();
		
		int opcao;
		double valor;
		
		c1.setNumeroConta(100123);
		c1.setDigitoVerif(4);
		c1.setCpfTitular("987.654.321-00");		
		c1.setNomeTitular("Professor Isidro");
		c1.setSaldo(0.0);
		
		
		do {
			System.out.println("Banco IsiTa� - Feito proc� ");
			System.out.println("Digite 1 - Deposito / 2 - Saque / 3 - Info / 0 - Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.print("Digite o valor do deposito:");
				valor = teclado.nextDouble();
				c1.creditar(valor);
				break;				
			case 2:
				System.out.print("Digite o valor do saque:");
				valor = teclado.nextDouble();				
				if (c1.debitar(valor)) {
					System.out.println("Saque autorizado!");
				}
				else {
					System.out.println("Saque n�o autorizado");
				}
				break;
			case 3:
				System.out.println(c1.exibirInfo());
				break;
			case 0:
				System.out.println("Obrigado pela preferencia");
				break;
			default:	
				System.out.println("Opcao invalida! Tente novamente");
			}
			
			
		} while (opcao  != 0);
		teclado.close();
	}

}
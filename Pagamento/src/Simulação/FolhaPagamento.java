import java.util.Scanner;

import Modelo.Funcionário;

package Simulação;

public class FolhaPagamento {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Funcionário f1, f2, f3, f4 = new Funcionário();
		
				
		f1.nome    			= "Chefe";
		f1.numRegistro 		= 1;
		f1.salarioBase 		= 10000.00;
		f1.adicionalFuncao 	= 500.00;
		f1.beneficioTerno 	= 200.00;
		
		f2.nome 			= "Comissionado";
		f2.numRegistro 		= 2;
		f2.salarioBase 		= 2000.00;
		f2.comissao    		= 2000.00;
		
		f3.nome 			= "Comissionado";
		f3.numRegistro 		= 3;
		f3.valorHora 		= 50.00;
		f3.numeroHoras 		= 160;
		
		f4.nome 			= "Comissionado";
		f4.numRegistro 		= 4;
		f4.valorempreita	= 50.00;
		
	}
		
				
		if (nome = chefe) {
		
			calcularSalario = SalarioBase + salarioBase * adicionalFuncao/ 100 + beneficioTerno; 
			
		}
					
		if (nome = comissionado) {
						
			calcularSalario =  salarioBase + salarioBase * comissao / 100;
		
		}
		
		if (nome = horista) {
				
			
				calcularSalario =  valorHora * numeroHoras;
				
		}
		
		if (nome = empreiteiro) {
					
					calcularSalario =  valorEmpreita;
				
						
		}
		
		
		System.out.println(" ===== Recibo de Pagamento do Funcionário" "\n");
		System.out.println(" ===== Funcionário: " +nome "==== \n");
		System.out.println(" ===== Número do Registro: " +numRegistro " ==== "\n");
		System.out.println(\"===== Pagamento de Salário: " +calcularSalario);
				
		
}

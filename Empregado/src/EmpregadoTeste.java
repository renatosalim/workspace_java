
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1, e2;
		
		e1 = new Empregado();
		e2 = new Empregado();
		
		e1.nome = "Fulano";
		e1.cargo = "Estagiario Jr";
		e1.salario = 1000.00;
		
		e2.nome = "Beltrano";
		e2.cargo = "Estagiario Sr";
		e2.salario = 5000.00;

		e1.imprimirInfo();
		e2.imprimirInfo();
		
		e1.aumentarSalario(10.0);
		e2.aumentarSalario(15.0);
		
		e1.imprimirInfo();
		e2.imprimirInfo();
		
	}

}
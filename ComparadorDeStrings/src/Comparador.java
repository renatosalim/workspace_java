
public class Comparador {
	public static void main(String[] args) {
		String s1, s2;
		
		s1 = "Oi, tudo bem? Vem sempre aqui?";
		s2 = "Oi, tudo bem? Vem sempre aqui?";
		
		if (s1 == s2) {
			System.out.println("Apontam para a mesma �rea da mem�ria");
		}
		else {
			System.out.println("Apontam para �reas de mem�ria distintas");
		}
		
		if (s1.equals(s2)) {
			System.out.println("Mesmo conte�do lexicografico");
		}
		else {
			System.out.println("Conte�dos lexicograficos distintos");
		}
		
		// se s1 e s2 s�o objetos, tudo o que eu alterar via s2, reflete em s1
		
		s2 = "Agora vai...";
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		
		
	}

}
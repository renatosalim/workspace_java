import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Meu primeiro programa no Eclipse");
		Scanner teclado = new Scanner (System.in);
		int a;
		a = teclado.nextInt();
		System.out.println("Voce Digitou = "+a);
		
		teclado.close();

	}
}
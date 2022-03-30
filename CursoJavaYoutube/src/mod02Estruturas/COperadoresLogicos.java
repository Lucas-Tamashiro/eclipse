package mod02Estruturas;
import java.util.Scanner;

public class COperadoresLogicos {
	public static void main(String[] args) {
		
		// Operadores lógicos
		/*
		 * && = AND - as 2 condições precisam ser verdadeiras
		 * || = OR - 1 ou 2 condições precisam ser verdadeiras
		 * ! = NOT - Reverte o valor da condição, ex: Se NÃO for igual a 1.
		 */
		
		// Operador && and, e.
		int temperatura = 20;
		
		if (temperatura >= 30) {
			System.out.println("Está calor");
		} else if (temperatura >= 20 && temperatura <30) {
			System.out.println("Está temperatura ambiente");
		} else if (temperatura <20) {
			System.out.println("Está frio");
		}
		
		// Operador "||" or, ou.
		Scanner scanner = new Scanner(System.in); //Necessário colocar o (System.in);

		System.out.println("Voce está jogando o jogo, aperte \"q ou \"Q para sair.");
		String q = scanner.next();
		
		if (q.equals("q") || q.equals("Q")) { // Para comparar Strings, se usa o .equals().
			System.out.println("Você saiu do jogo!");
		} else {
			System.out.println("Você ainda está jogando!");
		}

		// the ! not, não.
		System.out.println("Voce está jogando o jogo, aperte \"q ou \"Q para sair.");
		String q2 = scanner.next();
		
		if (!q2.equals("q") && !q2.equals("Q")) { // Para comparar Strings, se usa o .equals().
			System.out.println("Você ainda está jogando!");
		} else {
			System.out.println("Você saiu do jogo!");
		}
	}
}

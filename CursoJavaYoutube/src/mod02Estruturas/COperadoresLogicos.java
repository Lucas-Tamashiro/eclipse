package mod02Estruturas;
import java.util.Scanner;

public class COperadoresLogicos {
	public static void main(String[] args) {
		
		// Operadores l�gicos
		/*
		 * && = AND - as 2 condi��es precisam ser verdadeiras
		 * || = OR - 1 ou 2 condi��es precisam ser verdadeiras
		 * ! = NOT - Reverte o valor da condi��o, ex: Se N�O for igual a 1.
		 */
		
		// Operador && and, e.
		int temperatura = 20;
		
		if (temperatura >= 30) {
			System.out.println("Est� calor");
		} else if (temperatura >= 20 && temperatura <30) {
			System.out.println("Est� temperatura ambiente");
		} else if (temperatura <20) {
			System.out.println("Est� frio");
		}
		
		// Operador "||" or, ou.
		Scanner scanner = new Scanner(System.in); //Necess�rio colocar o (System.in);

		System.out.println("Voce est� jogando o jogo, aperte \"q ou \"Q para sair.");
		String q = scanner.next();
		
		if (q.equals("q") || q.equals("Q")) { // Para comparar Strings, se usa o .equals().
			System.out.println("Voc� saiu do jogo!");
		} else {
			System.out.println("Voc� ainda est� jogando!");
		}

		// the ! not, n�o.
		System.out.println("Voce est� jogando o jogo, aperte \"q ou \"Q para sair.");
		String q2 = scanner.next();
		
		if (!q2.equals("q") && !q2.equals("Q")) { // Para comparar Strings, se usa o .equals().
			System.out.println("Voc� ainda est� jogando!");
		} else {
			System.out.println("Voc� saiu do jogo!");
		}
	}
}

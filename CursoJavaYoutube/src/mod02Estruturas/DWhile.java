package mod02Estruturas;
import java.util.Scanner;

public class DWhile {
	public static void main(String[] args) {
		
		
		/* int x = 1;
		 * while (x==10) { // looping infinito EVITE AO MÁXIMO, acaba com o servidor.
		 * System.out.println("Looping!");
		 *  }
		 */
		
		// Estrutura While, looping até a condição se tornar verdadeira.
		Scanner scanner = new Scanner(System.in);
		String nome = ""; // Iniciamos a variável em branco
		
		while (nome.isBlank()) { // is.Blank() checa se esta em branco a variável.
			System.out.print("Digite seu nome: ");
			nome = scanner.nextLine(); // NextLine permite apertar enter sem ter digitado nada
		}
	
		System.out.println("Bem vindo " + nome);
		
		// Do com While, faz primeiro a tarefa depois verifica se continua fazendo.
		do {
			System.out.println("Do com while sempre faz pelo menos 1 vez, mesmo que a condição não se realize.");
		} while (nome.equals(""));
	}
}

package mod01Basico;

import java.util.Scanner;

public class CScanner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome, comida;
		int idade;
		
		System.out.println("Qual seu nome? ");
		nome = scanner.nextLine(); // caso aperte s� enter ele aceita

		System.out.println("Qual sua idade? ");
		idade = scanner.nextInt(); // caso aperte enter n�o aceita, precisa de um n�mero
		
		System.out.println("Qual sua comida favorita? ");
		comida = scanner.next(); // caso coloque nextLine aqui, ir� automaticamente pular
								 // esse scanner, pois o Line faz com que o programa entenda
								 // que j� foi apertado enter automaticamente, lendo nada.
		
		scanner.close(); // Bom uso do scanner, sempre fechar ap�s uso.
		
		System.out.println();
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(comida);
	}
}

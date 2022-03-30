package mod01Basico;

import java.util.Scanner;

public class CScanner {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome, comida;
		int idade;
		
		System.out.println("Qual seu nome? ");
		nome = scanner.nextLine(); // caso aperte só enter ele aceita

		System.out.println("Qual sua idade? ");
		idade = scanner.nextInt(); // caso aperte enter não aceita, precisa de um número
		
		System.out.println("Qual sua comida favorita? ");
		comida = scanner.next(); // caso coloque nextLine aqui, irá automaticamente pular
								 // esse scanner, pois o Line faz com que o programa entenda
								 // que já foi apertado enter automaticamente, lendo nada.
		
		scanner.close(); // Bom uso do scanner, sempre fechar após uso.
		
		System.out.println();
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(comida);
	}
}

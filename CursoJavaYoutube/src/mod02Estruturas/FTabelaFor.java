package mod02Estruturas;
import java.util.Scanner; // Scanner fica no diretório java.util

public class FTabelaFor {
	public static void main(String[] args) {
		
		// Loops aninhados, For loop, "1 for dentro de outro" (nested loops)
		
		int colunas, linhas;
		char a;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas: ");
		linhas = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o número de colunas: ");
		colunas = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o caractere para ilustração da tabela: ");
		a = scanner.next().charAt(0); // Pega a primeira letra da palavra inserida e colocar no char.
		
		for (int i=0; i<linhas; i++) { 	// Repete de 1 até o número escolhido de linhas
			System.out.println();		// Somente pula uma linha
			
			for(int j=0; j<colunas; j++) {  // Repete de 1 até o número escolhido de colunas
				System.out.print(a);		// Printa o char escolhido
			}
		}
	}
}

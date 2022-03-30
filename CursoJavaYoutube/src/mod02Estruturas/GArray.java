package mod02Estruturas;
import java.util.Scanner;

public class GArray {
	public static void main (String[] args) { 
		
		// String[] carros = {"Fusca", "Camaro", "Fiesta"}; Outro jeito de iniciar array
		
		String[] carros = new String[3]; // Iniciando um novo array (lista) de Strings com 3 vagas.
		
		carros[0] = "Camaro"; // Todo array e matriz se inicia com 0.
		carros[1] = "Fusca";
		carros[2] = "Fiesta";
	  //carro[3] = "teste"; ERROR index 3 out of bounds
		
		Scanner sc = new Scanner(System.in);

		
		for (int i=0; i<=2; i++) { // Pode-se usar o (i < carros.length), faz a mesma coisa.
			System.out.println("Digite o nome do " + (i+1) + "º " + "carro: ");
			carros[i] = sc.nextLine();
		}
		
		System.out.println("-----------------------------------------");
		
		for (int i=0; i<=2; i++) {
			System.out.println(carros[i]);
		}
		
		
		
	}
}

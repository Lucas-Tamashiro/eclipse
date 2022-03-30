package mod02Estruturas;
import java.util.Scanner;

public class HMatriz {
	public static void main (String[] args) {
		
		// Listas 2D (array 2D), ou matrizes.
		String[][] matriz = new String[3][3];
		
	    //Outra forma de declarar matriz
	    String[][] matriz2 =   {{"1","2","3"},
	    						{"4","5","6"}, 
	    						{"7","8","9"}};  
		
		matriz[0][0] = "1";
		matriz[0][1] = "2";
		matriz[0][2] = "3";
		matriz[1][0] = "4";
		matriz[1][1] = "5";
		matriz[1][2] = "6";
		matriz[2][0] = "7";
		matriz[2][1] = "8";
		matriz[2][2] = "9";
		
		// duplo for para printar a matriz
		for (int i=0; i<matriz.length; i++) { // matriz.length pega o nº de linhas
			System.out.println();
			
			for (int j=0; j<matriz[i].length; j++) { // martiz[0].length pega o número de colunas
				System.out.print(matriz[i][j]);
			}
		}
		
		// com método Scanner
		int[][] numMatriz = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("--------------------------------------------");
		
		// duplo for para scanner da matriz
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("Digite o número na posição ("+(i+1)+","+(j+1)+"): ");
				numMatriz[i][j] = Integer.parseInt(sc.nextLine()); 
			}
		}
		
		// testar matriz.length e matriz[0].length ou matriz[i].length
		for (int i=0; i<numMatriz.length;i++) { // sempre iniciar o i com zero no caso de matriz e array
			System.out.println();
			for (int j=0; j<numMatriz[0].length; j++) { //numMatriz[0] e numMatriz[i] não fez diferença nesse caso.
				System.out.print(numMatriz[i][j]);
			}
		}
		
		// recomendado sempre usar o .length, pois ele muda automático caso o valor das linhas/ colunas muda.
	}
}

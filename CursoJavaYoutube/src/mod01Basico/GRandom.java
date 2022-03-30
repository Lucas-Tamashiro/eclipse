package mod01Basico;
import java.util.Random;

public class GRandom {
	public static void main(String[] args) {
		
		Random random = new Random(); // Instânciando o Objeto Random.
		
		int x = random.nextInt(); // Gera um número aleatório do tamanho do range INT
		int x2 = random.nextInt(6)+1;	// Gera de (0 à 5) + 1, ou seja, 1 à 5
		double y = random.nextDouble(); // Gera um número aleatório real entre 0 e 1
		boolean z = random.nextBoolean(); // Gera um verdadeiro ou falso aleatório
		
		System.out.println(x);
		System.out.println(x2);
		System.out.println(y);
		System.out.println(z);
	}
}

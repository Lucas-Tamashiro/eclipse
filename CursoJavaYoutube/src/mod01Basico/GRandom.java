package mod01Basico;
import java.util.Random;

public class GRandom {
	public static void main(String[] args) {
		
		Random random = new Random(); // Inst�nciando o Objeto Random.
		
		int x = random.nextInt(); // Gera um n�mero aleat�rio do tamanho do range INT
		int x2 = random.nextInt(6)+1;	// Gera de (0 � 5) + 1, ou seja, 1 � 5
		double y = random.nextDouble(); // Gera um n�mero aleat�rio real entre 0 e 1
		boolean z = random.nextBoolean(); // Gera um verdadeiro ou falso aleat�rio
		
		System.out.println(x);
		System.out.println(x2);
		System.out.println(y);
		System.out.println(z);
	}
}

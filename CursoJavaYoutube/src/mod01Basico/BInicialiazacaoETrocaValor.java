package mod01Basico;

public class BInicialiazacaoETrocaValor {
	public static void main(String[] args) {
		
		// Trocar valores entre vari�veis:
		String x = "�gua";
		String y = "Suco";
		String temp = null;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
		
	}
}

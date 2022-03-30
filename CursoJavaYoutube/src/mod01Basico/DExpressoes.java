package mod01Basico;

public class DExpressoes {
	public static void main(String[] args) {
		
		// expressões = operandos e operadores
		// operandos = valores, variáveis, números, quantidade
		// operadores = + - * / %(Módulo)
		
		int amigos = 10;
		
		/*
		amigos = amigos + 1;
		amigos = amigos - 1;
		amigos = amigos * 2;
		amigos = amigos / 2;
		*/
		
		amigos++;
		amigos--;
		++amigos; // ao colocar na frente a soma tem prioridade, caso tenha outros operadores juntos
		--amigos;
		
		amigos = amigos % 3; // O resultado é a sobra da divisão
		
		System.out.println(amigos);
		
		// Ao dividir tome cuidado:
		double x = 10;
		// x = x / 3; caso queira número fracionado, não utilize int, sempre double.
		x = (double) x / 3; // para ter certeza que irá um valor double, coloque desse jeito
		System.out.println(x);
		
	}
}

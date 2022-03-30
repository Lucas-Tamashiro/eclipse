package mod01Basico;

public class AVariaveis {

	public static void main(String[] args) {
		
		// Vari�veis s�o placeholders, seguram lugar para valores, e existem de v�rios tipos.
	
		
		// Vari�veis Primitivas:
		boolean varBoolean; 	// Verdadeiro ou falso, 1 bit (2 valores, 0 e 1)
		
		byte varByte; 			// Guarda 1 byte, n�mero entre -128 at� 127
		short varShort; 		// Guarda 2 bytes, n�mero entre -32,768 at� 32,767
		int varInt;				// Guarda 4 bytes, -2bilh�es to 2 bilh�es
		long varLong;			// Guarda 8 bytes, -9 quintilh�es at� 9 quintilh�es
		
		float varFloat;			// Guarda 4 bytes e armazena at� 6-7 d�gitos fracion�rios ex: 3.141592f � necess�rio como o f no final para de todo n�mero float
		double varDouble;		// Guarda 8 bytes e armazena at� 15 d�gitos fracion�rios ex: 3.141592653589793
		
		char varChar;			// Guarda 2 bytes, �nico caractere/letra/databela ASCII ex: 'f'
		
		// Tipo de refer�ncia, Referencial:
		String varString;		// Varia o n� de bytes, sequ�ncia de caracteres ex: "Hello World!"
		
		/*
		 * Diferen�a entre PRIMITIVO E REFERENCIAL:
		 * 
		 * PRIMITIVO 		VS 		REFERENCIAL
		 * 8bytes					usu�rio decide
		 * Grava uma dado			Grava um endere�o
		 * Pode ter 1 valor			Pode ter mais de 1 valor
		 * Menos mem�ria			Mais mem�ria
		 * Mais r�pido				Mais devagar
		 */
		
		// Como criar um tipo de vari�vel:
		/*
		 * int x;			// Declarando Vari�vel
		 * x = 123;			// Atribui��o
		 */
		
		int x = 1231231231; 			// Inicializa��o (Declara e atribui)
		long y = 1231231231231121233L;	// Long precisa usar o "L" no final
		float w = 123.1312f;			// Float coloca-se o "f" no final
		double xx = 123.13121212;
		boolean xy = true;
		char simbolo = '@';
		String nome = "Lucas";
		
		System.out.println("Meu n�mero �: " + x);
	}
	
}

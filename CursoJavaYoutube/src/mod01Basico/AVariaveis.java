package mod01Basico;

public class AVariaveis {

	public static void main(String[] args) {
		
		// Variáveis são placeholders, seguram lugar para valores, e existem de vários tipos.
	
		
		// Variáveis Primitivas:
		boolean varBoolean; 	// Verdadeiro ou falso, 1 bit (2 valores, 0 e 1)
		
		byte varByte; 			// Guarda 1 byte, número entre -128 até 127
		short varShort; 		// Guarda 2 bytes, número entre -32,768 até 32,767
		int varInt;				// Guarda 4 bytes, -2bilhões to 2 bilhões
		long varLong;			// Guarda 8 bytes, -9 quintilhões até 9 quintilhões
		
		float varFloat;			// Guarda 4 bytes e armazena até 6-7 dígitos fracionários ex: 3.141592f é necessário como o f no final para de todo número float
		double varDouble;		// Guarda 8 bytes e armazena até 15 dígitos fracionários ex: 3.141592653589793
		
		char varChar;			// Guarda 2 bytes, único caractere/letra/databela ASCII ex: 'f'
		
		// Tipo de referência, Referencial:
		String varString;		// Varia o nº de bytes, sequência de caracteres ex: "Hello World!"
		
		/*
		 * Diferença entre PRIMITIVO E REFERENCIAL:
		 * 
		 * PRIMITIVO 		VS 		REFERENCIAL
		 * 8bytes					usuário decide
		 * Grava uma dado			Grava um endereço
		 * Pode ter 1 valor			Pode ter mais de 1 valor
		 * Menos memória			Mais memória
		 * Mais rápido				Mais devagar
		 */
		
		// Como criar um tipo de variável:
		/*
		 * int x;			// Declarando Variável
		 * x = 123;			// Atribuição
		 */
		
		int x = 1231231231; 			// Inicialização (Declara e atribui)
		long y = 1231231231231121233L;	// Long precisa usar o "L" no final
		float w = 123.1312f;			// Float coloca-se o "f" no final
		double xx = 123.13121212;
		boolean xy = true;
		char simbolo = '@';
		String nome = "Lucas";
		
		System.out.println("Meu número é: " + x);
	}
	
}

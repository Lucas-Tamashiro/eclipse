package mod03Classes;

public class Strings {
	public static void main (String[] args) {
		
		/*
		 * String é um tipo de dado de referência e pode armazenar um ou mais caractéres
		 * 		tipos de arquivos de referência, tem acesso á MÉTODOS úteis.
		 * 		Como nos exemplos abaixo:
		 */
		
		String nome = "Bro";
		
		// Esse método equals, é case sensitive:(maiúscullo e minúsculo interfere)
		boolean resultado = nome.equals("bro"); // .equals retorna um valor vdd ou falso
		System.err.println(resultado); 			// printa o resultado o equals										
		
		// Esse não é sensitive case.
		boolean resultado2 = nome.equalsIgnoreCase("bro"); 
		
		System.out.println(resultado2);
		
		// Armazena o número de caractéres da variável nome e mostra na tela
		int resInt = nome.length();
		System.out.println(resInt);
		
		// pego um caractere da String nome e printa na tela, o 1º é o "0"
		char resChar = nome.charAt(0); 
		System.out.println(resChar);
		
		// indexOf retorna a posição em array do caractere procurado em uma variável
		int indexOf = nome.indexOf('r');
		System.out.println(indexOf);
		
		// isEmpty retorna um valor boolean checando se esta vazio o String por exemplo.
		boolean isEmpty = nome.isEmpty();
		System.out.println(isEmpty);
		
		// toUpperCase e toLowerCase, retorna um String com as letras maiusculas e minusculas respectivamente.
		String toUpper, toLower;
		toUpper = nome.toUpperCase();
		System.out.println(toUpper);
		toLower = nome.toLowerCase();
		System.out.println(toLower);
		
		// Trim, retorna um String sem espaços no começo e final do String. mantendo os do meio.
		String nome2 = "      E s p a ç o s    ";
		String trim = nome2.trim();
		System.out.println(trim);
		
		// replace, troca um char por outro
		System.out.println(nome.replace('o','a'));
		
	}
}

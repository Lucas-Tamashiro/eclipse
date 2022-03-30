package mod03Classes;

public class Strings {
	public static void main (String[] args) {
		
		/*
		 * String � um tipo de dado de refer�ncia e pode armazenar um ou mais caract�res
		 * 		tipos de arquivos de refer�ncia, tem acesso � M�TODOS �teis.
		 * 		Como nos exemplos abaixo:
		 */
		
		String nome = "Bro";
		
		// Esse m�todo equals, � case sensitive:(mai�scullo e min�sculo interfere)
		boolean resultado = nome.equals("bro"); // .equals retorna um valor vdd ou falso
		System.err.println(resultado); 			// printa o resultado o equals										
		
		// Esse n�o � sensitive case.
		boolean resultado2 = nome.equalsIgnoreCase("bro"); 
		
		System.out.println(resultado2);
		
		// Armazena o n�mero de caract�res da vari�vel nome e mostra na tela
		int resInt = nome.length();
		System.out.println(resInt);
		
		// pego um caractere da String nome e printa na tela, o 1� � o "0"
		char resChar = nome.charAt(0); 
		System.out.println(resChar);
		
		// indexOf retorna a posi��o em array do caractere procurado em uma vari�vel
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
		
		// Trim, retorna um String sem espa�os no come�o e final do String. mantendo os do meio.
		String nome2 = "      E s p a � o s    ";
		String trim = nome2.trim();
		System.out.println(trim);
		
		// replace, troca um char por outro
		System.out.println(nome.replace('o','a'));
		
	}
}

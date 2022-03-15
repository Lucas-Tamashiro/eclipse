
public class RevisaoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste variáveis Java
		
		/*
		int numerico = 15;
		long numgrande = 33333333;
		double real = 3.33;
		char caractere = 'a';
		String texto = "Exemplo de texto";
		*/
		
		
		// String é uma cadeia de "char"
		String nome = "Lucas";
		
		// Transformar tudo em letras maiúsculas e minusculas respectivamente e mostra-las na tela:
		System.out.println(nome.toUpperCase());
		nome.toLowerCase(); //Dois jeitos de fazer o print, direto com o método, ou separado dele.
		System.out.println(nome);
		
		//Para chamar o método criado fora do main logo abaixo chamado "addPontoDeExclamação1", usa-se por exemplo:
		addPontoDeExclamacao1("Faça isso agora");
		
		//Para chamar o método criado fora do main logo abaixo chamado "addPontoDeExclamação2", usa-se por exemplo:
		String exclamacao = addPontoDeExclamacao2("Rumo ao sucesso");
		System.out.println(exclamacao);
	}
	
	// criando um método SEM retorno, começa fora do método main:
	public static void addPontoDeExclamacao1(String s1) {
		System.out.println(s1 + "!");
	}
	
	// criando um método COM retorno, começa fora do método main:
	public static String addPontoDeExclamacao2(String s2) {
		return s2 + "!";
	}


}

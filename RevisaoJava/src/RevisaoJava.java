
public class RevisaoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste vari�veis Java
		
		/*
		int numerico = 15;
		long numgrande = 33333333;
		double real = 3.33;
		char caractere = 'a';
		String texto = "Exemplo de texto";
		*/
		
		
		// String � uma cadeia de "char"
		String nome = "Lucas";
		
		// Transformar tudo em letras mai�sculas e minusculas respectivamente e mostra-las na tela:
		System.out.println(nome.toUpperCase());
		nome.toLowerCase(); //Dois jeitos de fazer o print, direto com o m�todo, ou separado dele.
		System.out.println(nome);
		
		//Para chamar o m�todo criado fora do main logo abaixo chamado "addPontoDeExclama��o1", usa-se por exemplo:
		addPontoDeExclamacao1("Fa�a isso agora");
		
		//Para chamar o m�todo criado fora do main logo abaixo chamado "addPontoDeExclama��o2", usa-se por exemplo:
		String exclamacao = addPontoDeExclamacao2("Rumo ao sucesso");
		System.out.println(exclamacao);
	}
	
	// criando um m�todo SEM retorno, come�a fora do m�todo main:
	public static void addPontoDeExclamacao1(String s1) {
		System.out.println(s1 + "!");
	}
	
	// criando um m�todo COM retorno, come�a fora do m�todo main:
	public static String addPontoDeExclamacao2(String s2) {
		return s2 + "!";
	}


}

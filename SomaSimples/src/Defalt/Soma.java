package Defalt;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1,num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculadora simples, soma entre 2 n�meros reais");
		System.out.println();
		
		System.out.print("Insira o 1� n�mero: ");
		num1 = scanner.nextFloat();
		System.out.println();
		
		System.out.print("Insira o 2� n�mero: ");
		num2 = scanner.nextFloat();
		System.out.println();
		
		System.out.println("Soma entre o n�mero " + num1 + " e o n�mero " + num2 + " = " + (num1 + num2));
		
		
	}

}

package mod01Basico;

import javax.swing.JOptionPane; // Para usar janelas é necessário o swing.JOptionPane

public class FClasseMatematica {
	public static void main(String[] args) {
		
		/* Estudo do Método Math(matemática)
		
		double x = 3.14;
		double y = -10.2;
		
		System.out.println(Math.max(x, y)); // Mostra o maior
		System.out.println(Math.min(x, y)); // Mostra o menor
		System.out.println(Math.abs(y)); 	// Módulo
		System.out.println(Math.sqrt(y));	// Raiz quadrada
		System.out.println(Math.round(x));	// Tira a parte fracionada do número
		System.out.println(Math.ceil(y));	// Arredonda sempre pra cima, ceil(teto)
		System.out.println(Math.floor(y));	// Arredonda sempre pra baixo, floor(chão)
		*/
			
		double a,b,c;
		
		System.out.println("Cálculo da hipotenusa");
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º cateto: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º cateto: "));
		
		c = Math.sqrt(a*a+b*b); //Math.sqrt = raiz quadrada.
		
		JOptionPane.showMessageDialog(null,	"A hipotenusa do triângulo com lados igual a "
										+ "(" + a + " e " + b + ") = " + c);
	}
}

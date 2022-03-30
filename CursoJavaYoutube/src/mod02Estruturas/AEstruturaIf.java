package mod02Estruturas;
import javax.swing.JOptionPane; // jop utiliza javaX.swing, javax é uma extensão do java

public class AEstruturaIf {
	public static void main(String[] args) {
		
		// Estrutura de condicional IF
		/* Caso a condição for verdadeira, o código abaixo será executado, caso não, passará
		 * para o else, e executara os próximos comandos.
		 */
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos de idade.");
		
		if (idade >= 60) {
			JOptionPane.showInternalMessageDialog(null, "Você é um Boomer");
		} else if (idade >= 18) {
			JOptionPane.showInternalMessageDialog(null, "Você é adulto!");
		} else if(idade >= 12) {
			JOptionPane.showMessageDialog(null, "Você é adolescente!");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Você é uma criança!");
		}
		
		
		
	}
}

package mod02Estruturas;
import javax.swing.JOptionPane; // jop utiliza javaX.swing, javax � uma extens�o do java

public class AEstruturaIf {
	public static void main(String[] args) {
		
		// Estrutura de condicional IF
		/* Caso a condi��o for verdadeira, o c�digo abaixo ser� executado, caso n�o, passar�
		 * para o else, e executara os pr�ximos comandos.
		 */
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		JOptionPane.showMessageDialog(null, "Voc� tem " + idade + " anos de idade.");
		
		if (idade >= 60) {
			JOptionPane.showInternalMessageDialog(null, "Voc� � um Boomer");
		} else if (idade >= 18) {
			JOptionPane.showInternalMessageDialog(null, "Voc� � adulto!");
		} else if(idade >= 12) {
			JOptionPane.showMessageDialog(null, "Voc� � adolescente!");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Voc� � uma crian�a!");
		}
		
		
		
	}
}

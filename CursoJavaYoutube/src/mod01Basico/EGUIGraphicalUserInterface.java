package mod01Basico;

import javax.swing.JOptionPane; // Precisa de importar o pacote dessa classe.

public class EGUIGraphicalUserInterface {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Insira seu nome: ");
		JOptionPane.showMessageDialog(null, "Ol� " + nome + ".");
		
		// Convertendo o texto capturado em int, n� inteiro.
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
		JOptionPane.showMessageDialog(null, "Voc� tem " + idade + " anos de idade.");
		
		// Convertendo o texto capturado em double, n� real.
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		JOptionPane.showMessageDialog(null,"Voc� tem " + altura + " metros de altura.");
		
	}
}

package mod01Basico;

import javax.swing.JOptionPane; // Precisa de importar o pacote dessa classe.

public class EGUIGraphicalUserInterface {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Insira seu nome: ");
		JOptionPane.showMessageDialog(null, "Olá " + nome + ".");
		
		// Convertendo o texto capturado em int, nº inteiro.
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
		JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos de idade.");
		
		// Convertendo o texto capturado em double, nº real.
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		JOptionPane.showMessageDialog(null,"Você tem " + altura + " metros de altura.");
		
	}
}

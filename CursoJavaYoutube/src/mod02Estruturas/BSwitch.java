package mod02Estruturas;
import javax.swing.JOptionPane;

public class BSwitch {
	public static void main(String[] args) {
		
		// Treino da estrutura Switch, verifica v�rios valores poss�veis de uma vari�vel e
		// realiza uma a��o ao encontrar o valor correspondente.
		// Switch � bom quando testa equival�ncia v�rias vezes.
	
		String dia = JOptionPane.showInputDialog("Digite o dia da semana "
				+ "(segunda, ter�a, quarta, quinta, sexta, s�bado e domingo)");
		
		
		switch (dia) {
		case "segunda":  // caso o dia == segunda ir� fazer o que est� dentro do {}
			JOptionPane.showMessageDialog(null, "Hoje � segunda!");
			break; // necess�rio o break para parar de rodar o resto das op��es.
		
		case "ter�a": 
			JOptionPane.showMessageDialog(null, "Hoje � ter�a!");
			break;
		
		case "quarta": 
			JOptionPane.showMessageDialog(null, "Hoje � quarta!");
			break;
		
		case "quinta": 
			JOptionPane.showMessageDialog(null, "Hoje � quinta!");
			break;
		
		case "sexta": 
			JOptionPane.showMessageDialog(null, "Hoje � sexta!");
			break;
		
		case "s�bado": 
			JOptionPane.showMessageDialog(null, "Hoje � s�bado!");
			break;
		
		case "domingo": 
			JOptionPane.showMessageDialog(null, "Hoje � domingo!");
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + dia);
			// caso n�o encontre o mesmo valor, ser� lan�ado um erro(exce��o), dizendo:
			// Valor n�o esperado e o valor que o usu�rio digitou.
		}
		
	}
}

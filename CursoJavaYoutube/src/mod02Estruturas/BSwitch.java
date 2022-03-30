package mod02Estruturas;
import javax.swing.JOptionPane;

public class BSwitch {
	public static void main(String[] args) {
		
		// Treino da estrutura Switch, verifica vários valores possíveis de uma variável e
		// realiza uma ação ao encontrar o valor correspondente.
		// Switch é bom quando testa equivalência várias vezes.
	
		String dia = JOptionPane.showInputDialog("Digite o dia da semana "
				+ "(segunda, terça, quarta, quinta, sexta, sábado e domingo)");
		
		
		switch (dia) {
		case "segunda":  // caso o dia == segunda irá fazer o que está dentro do {}
			JOptionPane.showMessageDialog(null, "Hoje é segunda!");
			break; // necessário o break para parar de rodar o resto das opções.
		
		case "terça": 
			JOptionPane.showMessageDialog(null, "Hoje é terça!");
			break;
		
		case "quarta": 
			JOptionPane.showMessageDialog(null, "Hoje é quarta!");
			break;
		
		case "quinta": 
			JOptionPane.showMessageDialog(null, "Hoje é quinta!");
			break;
		
		case "sexta": 
			JOptionPane.showMessageDialog(null, "Hoje é sexta!");
			break;
		
		case "sábado": 
			JOptionPane.showMessageDialog(null, "Hoje é sábado!");
			break;
		
		case "domingo": 
			JOptionPane.showMessageDialog(null, "Hoje é domingo!");
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + dia);
			// caso não encontre o mesmo valor, será lançado um erro(exceção), dizendo:
			// Valor não esperado e o valor que o usuário digitou.
		}
		
	}
}

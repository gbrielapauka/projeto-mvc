package br.com.projetoMVC.test;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {

	public static void main(String[] args) {
		
		//Exemplo de captura de dados do usuario através da classe JOptionPane
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		// Exemplo de saída de dados com a classe JOptionPane
		JOptionPane.showMessageDialog(null,"Nome digitado " + nome);

		String menu = "Menu de opções"
				+ "\n[1] Cadastrar"
				+ "\n[2] Listar todos"
				+ "\n\nEscolha uma opção";
		
		// Exemplo de conversãode dados
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		JOptionPane.showMessageDialog(null, opcao);
	}

}

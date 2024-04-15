package br.com.projetoMVC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.projetoMVC.controller.ProdutoController;
import br.com.projetoMVC.model.Produto;
import br.com.projetoMVC.util.ConnectionFactory;

public class Main {

	public static void main(String[] args) {

		ProdutoController controller = new ProdutoController();
		int opcao = 0;

		do {

			String menu = "*** Menu de opções ***"
					.concat("\n[1] Listar todos")
					.concat("\n[2] Listar por ID")
					.concat("\n[3] Cadastrar")
					.concat("\n[4] Alterar")
					.concat("\n[5] Excluir")
					.concat("\n[0] Sair");

			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcao) {
			
			case 1:
				List<Produto> lista = new ArrayList<Produto>();
				lista = controller.listarTodos();

				
				if(lista.size() > 0) {
					String mensagemLista = " "
							.concat("- Lista de produtos-")
							.concat("\n")
							.concat("Cod.   Decrição");

					for(Produto produto : lista) {
						mensagemLista = mensagemLista
								.concat("\n")
								.concat(String.valueOf(produto.getId()))
								.concat("   ")
								.concat(produto.getDesricao());
					}
					JOptionPane.showConfirmDialog(null, mensagemLista);
				} else {
					JOptionPane.showMessageDialog(null, "Não existe produtos cadastrados!");
				}
				
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				Produto novoProduto = new Produto();
				novoProduto.setDesricao(JOptionPane.showInputDialog("Descrição do produto:"));

				controller.cadastrar(novoProduto);
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null, "Alterar");
				break;
				
			case 5:
				JOptionPane.showMessageDialog(null, "Excluir");
				break;
				
			case 0:
				JOptionPane.showMessageDialog(null, "Saindo do menu");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida para o código " + opcao);
			}

		} while (opcao != 0);
	}
}


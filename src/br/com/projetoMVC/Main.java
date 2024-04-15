package br.com.projetoMVC;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.projetoMVC.controller.ProdutoController;
import br.com.projetoMVC.model.Produto;

public class Main {

	public static void main(String[] args) {
		
		ProdutoController controller = new ProdutoController();
		
		Produto novoProduto = new Produto();
		novoProduto.setDesricao(JOptionPane.showInputDialog("Descrição do produto:"));
		
		controller.cadastrar(novoProduto);
		
		List<Produto> lista = new ArrayList<Produto>();
		lista = controller.listarTodos();
		
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
		
	}

}

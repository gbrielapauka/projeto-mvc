package br.com.projetoMVC;

import java.util.ArrayList;
import java.util.List;

import br.com.projetoMVC.controller.ProdutoController;
import br.com.projetoMVC.model.Produto;

public class Main {

	public static void main(String[] args) {
		
		ProdutoController controller = new ProdutoController();
		
		List<Produto> lista = new ArrayList<Produto>();
		lista = controller.listarTodos();
		
		System.out.println("- Lista de produtos -");
		for(Produto produto : lista) {
			produto.getDesricao();
			System.out.println(produto.getDesricao());
		}
		
	}

}

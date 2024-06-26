package br.com.projetoMVC.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.projetoMVC.DAO.GenericDAO;
import br.com.projetoMVC.DAO.ProdutoDAOImpl;
import br.com.projetoMVC.model.Produto;

public class ProdutoController {
	
	public List<Produto> listarTodos() {
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		try {
			GenericDAO dao = new ProdutoDAOImpl();
			
			for (Object object : dao.listarTodos()) {
				listaProdutos.add((Produto) object);
			}
		} catch (Exception e) {
			System.out.println("Erro na Controller ao listar Produto");
			e.printStackTrace();
		}
		
		return listaProdutos;
	}
	
	public void cadastrar(Produto produto) {
		try {
			GenericDAO dao = new ProdutoDAOImpl();
			if (dao.cadastrar(produto)) {
				JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Problemas ao cadastrar produto");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Produto listarPorId(int id) {
		try {
			GenericDAO dao = new ProdutoDAOImpl();
			Produto produto = (Produto) dao.listarPorId(id);
			return produto;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}

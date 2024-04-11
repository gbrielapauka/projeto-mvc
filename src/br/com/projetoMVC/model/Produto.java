package br.com.projetoMVC.model;

public class Produto {
	
	private int id;
	private String desricao;
	
	public Produto () {
		
	}
	 
	public Produto(int id, String desricao) {
		this.id = id;
		this.desricao = desricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesricao() {
		return desricao;
	}

	public void setDesricao(String desricao) {
		this.desricao = desricao;
	}
	
	
}

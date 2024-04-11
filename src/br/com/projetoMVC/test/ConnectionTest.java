package br.com.projetoMVC.test;

import java.sql.Connection;

import br.com.projetoMVC.util.ConnectionFactory;

public class ConnectionTest {
	public static void main(String[] args) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			if (connection != null) {
				System.out.println("Conexão estabelecida com sucesso!");
			}
			
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao conecetar: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
